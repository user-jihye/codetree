package org.imjihye.trail01.chapter06.lesson03;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-print-star-4/description">LINK</a>
 */
public class ChallengePrintStar4 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n-i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }

    for (int i = n-1; i > 0; i--) {
      for (int j = 0; j <= n-i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }

  }
}
