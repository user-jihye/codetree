package org.imjihye.trail01.chapter06.lesson02;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-print-star-5/description">LINK</a>
 */
public class ChallengePrintStar5 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int i = n; i > 0; i--) {
      for (int x = 1; x <= i; x++) {
        for (int j = 1; j <= i; j++) {
          System.out.print("*");
        }
        System.out.print(" ");
      }
      System.out.println();
    }
  }
}
