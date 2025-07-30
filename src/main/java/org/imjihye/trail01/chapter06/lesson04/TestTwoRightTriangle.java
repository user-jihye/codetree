package org.imjihye.trail01.chapter06.lesson04;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/test-two-right-triangle/description">LINK</a>
 */
public class TestTwoRightTriangle {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int i = n; i > 0; i--) {

      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }

      for (int j = 0; j < n-i; j++){
        System.out.print("  ");
      }

      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }

      System.out.println();
    }
  }
}
