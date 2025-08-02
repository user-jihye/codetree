package org.imjihye.trail01.chapter06.lesson08;

import java.util.*;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/intro-print-in-row/description">LINK</a>
 */
public class IntroPrintInRow {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      for (int j = 1; j <= n; j++) {
        System.out.print(j);
      }
      System.out.println();
    }
  }
}
