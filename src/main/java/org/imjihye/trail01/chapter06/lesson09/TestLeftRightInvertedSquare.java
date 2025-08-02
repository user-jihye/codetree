package org.imjihye.trail01.chapter06.lesson09;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/test-left-right-inverted-square/description">LINK</a>
 */
public class TestLeftRightInvertedSquare {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int y = 1; y <= n; y++) {
      for (int x = n; x > 0; x--) {
        System.out.println((x * y) + " ");
      }
      System.out.println();
    }
  }
}
