package org.imjihye.trail01.chapter06.lesson06;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/intro-print-star-8/description">LINK</a>
 */
public class IntroPrintStar8 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int i = 1; i <= n; i++) {
      if (i % 2 == 1) {
        System.out.println("*");
      } else {
        for (int j = 0; j < i; j++) {
          System.out.print("* ");
        }
        System.out.println();
      }
    }
  }
}
