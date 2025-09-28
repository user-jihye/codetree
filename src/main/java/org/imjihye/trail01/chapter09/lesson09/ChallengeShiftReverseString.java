package org.imjihye.trail01.chapter09.lesson09;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-shift-reverse-string/description">LINK</a>
 */
public class ChallengeShiftReverseString {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    int len = str.length();
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      int type = sc.nextInt();
      char[] arr = str.toCharArray();

      // 왼쪽으로 한 칸 씩 이동
      if (type == 1) {
        char front = arr[0];
        for (int j = 1; j < len; j++)
          arr[j - 1] = arr[j];
        arr[len - 1] = front;

        // 오른쪽으로 한 칸 씩 이동
      } else if (type == 2) {
        char back = arr[len - 1];
        for (int j = len - 2; j >= 0 ;j--)
          arr[j + 1] = arr[j];
        arr[0] = back;

        //좌우 뒤집기
      } else if (type == 3) {
        for (int j = 0; j < len / 2; j++) {
          char temp = arr[j];
          arr[j] = arr[len - j - 1];
          arr[len - j - 1] = temp;
        }
      }
      str = new String(arr);
      System.out.println(str);
    }
  }
}
