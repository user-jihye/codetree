package org.imjihye.trail01.chapter06.lesson08;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-making-order-pair/description">LINK</a>
 */
public class ChallengeMakingOrderPair {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int i = n; i > 0; i--) {
      for (int j = n; j > 0; j--) {
        System.out.printf("(%d,%d) ", i, j);
      }
      System.out.println();
    }
  }
}
