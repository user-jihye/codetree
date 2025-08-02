package org.imjihye.trail01.chapter06.lesson11;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-print-lr-zigzag/description">LINK</a>
 */
public class ChallengePrintLrZigzag {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int y = 0; y < n; y++) {
      if (y % 2 == 0) {
        for (int x = y * n + 1; x <= y * n + n; x++) {
          System.out.print(x + " ");
        }
      } else {
        for (int x = y * n + n; x >= y * n + 1; x--) {
          System.out.print(x + " ");
        }
      }
      System.out.println();
    }
  }
}
