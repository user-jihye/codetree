package org.imjihye.trail01.chapter06.lesson02;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/test-Right-triangle-and-output/description">LINK</a>
 */
public class TestRightTriangleAndOutput {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= i * 2 + 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
