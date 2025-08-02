package org.imjihye.trail01.chapter06.lesson08;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-print-in-column/description">LINK</a>
 */
public class ChallengePrintInColumn {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        System.out.print(i);
      }
      System.out.println();
    }
  }
}
