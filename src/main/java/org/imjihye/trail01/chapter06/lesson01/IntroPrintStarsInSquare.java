package org.imjihye.trail01.chapter06.lesson01;

import java.util.*;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/intro-print-stars-in-square/description">LINK</a>
 */
public class IntroPrintStarsInSquare {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
