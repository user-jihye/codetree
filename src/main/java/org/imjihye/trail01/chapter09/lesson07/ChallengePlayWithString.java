package org.imjihye.trail01.chapter09.lesson07;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-play-with-string/description">LINK</a>
 */
public class ChallengePlayWithString {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int Q = sc.nextInt();

    char[] arr = S.toCharArray();
    for (int i = 0; i < Q; i++) {
      int type = sc.nextInt();

      if (type == 1) {
        int a = sc.nextInt();
        int b = sc.nextInt();

        char temp = arr[a-1];
        arr[a-1] = arr[b-1];
        arr[b-1] = temp;

      } else if (type == 2) {
        char x = sc.next().charAt(0);
        char y = sc.next().charAt(0);

        for (int j = 0; j < arr.length; j++) {
          if (arr[j] == x)
            arr[j] = y;
        }
      }
      System.out.println(String.valueOf(arr));
    }
  }
}
