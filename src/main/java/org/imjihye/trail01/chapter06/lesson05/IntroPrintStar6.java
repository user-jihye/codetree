package org.imjihye.trail01.chapter06.lesson05;

import java.util.*;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/intro-print-star-6/description">LINK</a>
 */
public class IntroPrintStar6 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int i = n; i > 0; i--) {
      for (int j = 0; j < n - i; j++) {
        System.out.print("  ");
      }
      for (int j = 0; j < i * 2 - 1; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }

    for (int i = 1; i < n; i++) {
      for (int j = 1; j < n - i; j++) {
        System.out.print("  ");
      }
      for (int j = 0; j < i * 2 + 1; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
