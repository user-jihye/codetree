import sys
import os
import re
import pyperclip

# 윈도우 콘솔 인코딩 문제 해결
if sys.platform == 'win32':
    import codecs
    sys.stdout = codecs.getwriter('utf-8')(sys.stdout.detach())
    sys.stderr = codecs.getwriter('utf-8')(sys.stderr.detach())

def copy_java_file_as_main(file_path, class_name_hint=None):
    """
    Java 파일의 클래스명을 임시로 Main으로 변경하고 클립보드에 복사
    """
    try:
        # 파일 읽기
        with open(file_path, 'r', encoding='utf-8') as f:
            original_content = f.read()

        # 클래스명 찾기 (public class ClassName 패턴)
        class_pattern = r'(public\s+class\s+)(\w+)'
        match = re.search(class_pattern, original_content)

        if not match:
            print("public class 선언을 찾을 수 없습니다.")
            return

        original_class_name = match.group(2)

        # 파일명과 클래스명이 일치하는지 확인
        file_name_without_ext = os.path.splitext(os.path.basename(file_path))[0]
        if original_class_name != file_name_without_ext:
            print(f"경고: 파일명({file_name_without_ext})과 클래스명({original_class_name})이 다릅니다.")

        print(f"원본 클래스명: {original_class_name}")

        # package 선언 제거
        package_pattern = r'package\s+[^;]+;\s*\n?'
        modified_content = re.sub(package_pattern, '', original_content)

        # Main으로 변경
        modified_content = re.sub(class_pattern, r'\1Main', modified_content)

        # 생성자명도 Main으로 변경
        constructor_pattern = rf'(public\s+){re.escape(original_class_name)}(\s*\()'
        modified_content = re.sub(constructor_pattern, r'\1Main\2', modified_content)

        # 앞쪽 공백줄 정리 (package 제거로 인한 빈 줄들)
        modified_content = re.sub(r'^\s*\n+', '', modified_content)

        # 클립보드에 복사
        pyperclip.copy(modified_content)
        print(f"[성공] 클립보드에 복사 완료!")
        print(f"   - 패키지 선언 제거됨")
        print(f"   - 클래스명: {original_class_name} -> Main")
        print(f"   - 생성자명도 함께 변경됨")

        # 간단한 통계
        lines = len(modified_content.split('\n'))
        chars = len(modified_content)
        print(f"   - 총 {lines}줄, {chars}자")

    except Exception as e:
        print(f"[오류] 오류 발생: {e}")

if __name__ == "__main__":
    if len(sys.argv) < 2:
        print("[오류] IntelliJ에서 파일 경로가 전달되지 않았습니다.")
        print("External Tool 설정에서 Arguments에 '$FilePath를 추가하세요.")
        sys.exit(1)

    file_path = sys.argv[1]
    class_name_hint = sys.argv[2] if len(sys.argv) > 2 else None

    # 파일 존재 여부 확인
    if not os.path.exists(file_path):
        print(f"[오류] 파일을 찾을 수 없습니다: {file_path}")
        sys.exit(1)

    # Java 파일인지 확인
    if not file_path.endswith('.java'):
        print(f"[오류] Java 파일만 처리할 수 있습니다. 현재 파일: {file_path}")
        sys.exit(1)

    print(f"[처리 중] {os.path.basename(file_path)}")
    copy_java_file_as_main(file_path, class_name_hint)
