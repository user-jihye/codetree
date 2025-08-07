package org.imjihye.trail01.chapter06.lesson14;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/test-a-right-triangle-made-up-of-multiplication-tables/description">LINK</a>
 */
public class TestARightTriangleMadeUpOfMultiplicationTables {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n - i + 1; j++) {
        System.out.print(i + " * " + j + " = " + i*j);
        if (j < n - i + 1)
          System.out.print(" / ");
      }
      System.out.println();
    }
  }
}
