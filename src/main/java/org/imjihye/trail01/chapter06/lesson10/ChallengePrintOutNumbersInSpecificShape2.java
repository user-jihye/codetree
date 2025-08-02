package org.imjihye.trail01.chapter06.lesson10;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-print-out-numbers-in-specific-shape-2/description">LINK</a>
 */
public class ChallengePrintOutNumbersInSpecificShape2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int cnt = 2;

    for (int y = 0; y < n; y++) {
      for (int x = 0; x < n; x++) {
        System.out.print(cnt + " ");
        cnt += 2;
        if (cnt == 10)
          cnt = 2;
      }
      System.out.println();
    }
  }
}
