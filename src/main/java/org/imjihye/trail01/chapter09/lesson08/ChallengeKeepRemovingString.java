package org.imjihye.trail01.chapter09.lesson08;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-keep-removing-string/description">LINK</a>
 */
public class ChallengeKeepRemovingString {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String str1 = sc.next();
    String str2 = sc.next();

    int len1 = str1.length();
    int len2 = str2.length();

    while (true) {
      // a문자열에서 b문자열이 처음 등장하는 위치
      int idx = -1;

      // 마지막 위치: i + len2 - 1 < len1
      // => i < len1 - len2 + 1
      int candidates = len1 - len2 + 1;

      // 비교하면서 체크
      for (int i = 0; i < candidates; i++) {

        // 찾은 경우
        if (str1.substring(i, i+len2).equals(str2)) {
          str1 = str1.substring(0, i) + str1.substring(i + len2);
          len1 = str1.length();
          idx = i;
          break;
        }
      }

      // 찾지 못한 경우
      if (idx == -1)
        break;
    }

    System.out.println(str1);
  }
}
