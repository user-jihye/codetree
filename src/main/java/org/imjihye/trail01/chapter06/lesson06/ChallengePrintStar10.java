package org.imjihye.trail01.chapter06.lesson06;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-print-star-10/description">LINK</a>
 */
public class ChallengePrintStar10 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int even = n, odd = 1;
    for (int i = 1; i <= n; i++) {
      if (i % 2 == 1) {
        for (int j = 0; j < odd; j++) {
          System.out.print("* ");
        }
        odd++;
      } else {
        for (int j = 0; j < even; j++) {
          System.out.print("* ");
        }
        even--;
      }
      System.out.println();
    }

    for (int i = n; i > 0; i--) {
      if (i % 2 == 0) {
        for (int j = 0; j < odd; j++) {
          System.out.print("* ");
        }
        odd++;
      } else {
        for (int j = 0; j < even; j++) {
          System.out.print("* ");
        }
        even--;
      }
      System.out.println();
    }
  }
}
