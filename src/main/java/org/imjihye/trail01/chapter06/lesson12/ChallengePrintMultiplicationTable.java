package org.imjihye.trail01.chapter06.lesson12;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-print-multiplication-table/description">LINK</a>
 */
public class ChallengePrintMultiplicationTable {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a, b;
    a = sc.nextInt();
    b = sc.nextInt();

    for (int i = 1; i <= 9; i++) {
      for (int j = b; j >= a; j -= 2) {
        System.out.printf("%d * %d = %d", j, i, i*j);
        if (j > a)
          System.out.print(" / ");
      }
      System.out.println();
    }
  }
}
