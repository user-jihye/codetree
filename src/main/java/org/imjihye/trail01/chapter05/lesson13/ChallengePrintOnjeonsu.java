package org.imjihye.trail01.chapter05.lesson13;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-print-onjeonsu/description">LINK</a>
 */
public class ChallengePrintOnjeonsu {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int i = 1; i <= n; i++) {
      if (i % 2 == 0) {
        continue;
      }

      if (i % 10 == 5) {
        continue;
      }

      if (i % 3 == 0 && i % 9 != 0) {
        continue;
      }

      System.out.print(i + " ");
    }
  }
}
