package org.imjihye.trail01.chapter06.lesson07;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/intro-print-star-11/description">LINK</a>
 */
public class IntroPrintStar11 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int i = 0; i <= n * 2; i++) {
      for (int j = 0; j <= n * 2; j++) {
        if (i % 2 == 0 || j % 2 == 0) {
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }
  }
}
