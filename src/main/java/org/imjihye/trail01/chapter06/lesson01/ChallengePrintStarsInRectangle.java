package org.imjihye.trail01.chapter06.lesson01;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-print-stars-in-rectangle/description">LINK</a>
 */
public class ChallengePrintStarsInRectangle {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n, m;
    n = sc.nextInt();
    m = sc.nextInt();

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
