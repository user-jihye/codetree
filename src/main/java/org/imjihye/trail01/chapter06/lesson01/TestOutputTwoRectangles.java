package org.imjihye.trail01.chapter06.lesson01;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/test-output-two-rectangles/description">LINK</a>
 */
public class TestOutputTwoRectangles {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int x = 0; x < 2; x++) {
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
          System.out.print("*");
        }
        System.out.println();
      }
      System.out.println();
    }
  }
}
