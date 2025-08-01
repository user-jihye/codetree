package org.imjihye.trail01.chapter06.lesson06;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/test-print-start-13/description">LINK</a>
 */
public class TestPrintStart13 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int i = 0; i < 2 * n; i++) {
      if (i % 2 == 0) {
        for (int j = 0; j < n - (i / 2); j++) {
          System.out.print("* ");
        }
      } else {
        for (int j = 0; j < (i / 2) + 1; j++) {
          System.out.print("* ");
        }
      }
      System.out.println();
    }
  }
}
