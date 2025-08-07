package org.imjihye.trail01.chapter06.lesson13;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-print-out-numbers-in-specific-shape/description">LINK</a>
 */
public class ChallengePrintOutNumbersInSpecificShape {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int i = n; i > 0; i--) {
      for (int j = n; j > 0; j--) {
        if (j > i) {
          System.out.print("  ");
        } else {
          System.out.print(j + " ");
        }
      }
      System.out.println();
    }
  }
}
