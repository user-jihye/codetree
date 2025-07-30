package org.imjihye.trail01.chapter06.lesson04;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-print-star-9/description">LINK</a>
 */
public class ChallengePrintStar9 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int i = 1; i <= n; i++) {

      for (int j = 1; j <= n-i; j++) {
        System.out.print("  ");
      }

      for (int j = 1; j <= i * 2 - 1; j++) {
        System.out.print("* ");
      }

      System.out.println();
    }
  }
}
