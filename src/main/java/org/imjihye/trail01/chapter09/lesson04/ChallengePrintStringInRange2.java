package org.imjihye.trail01.chapter09.lesson04;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-print-string-in-range-2/description">LINK</a>
 */
public class ChallengePrintStringInRange2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    int x = sc.nextInt();

    int len = str.length();
    int cnt = 0;
    for (int i = len - 1; i >= 0; i--) {
      if (cnt == x)
        break;

      System.out.print(str.charAt(i));
      cnt++;
    }

  }
}
