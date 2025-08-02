package org.imjihye.trail01.chapter06.lesson11;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/intro-print-in-left-right-reverse/description">LINK</a>
 */
public class IntroPrintInLeftRightReverse {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int y = 1; y <= n; y++) {
      if (y % 2 == 1) {
        for (int x = 1; x <= n; x++) {
          System.out.print(x);
        }
      } else {
        for (int x = n; x >= 1; x--) {
          System.out.print(x);
        }
      }
      System.out.println();
    }
  }
}
