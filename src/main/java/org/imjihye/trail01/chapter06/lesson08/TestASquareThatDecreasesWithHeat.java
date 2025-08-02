package org.imjihye.trail01.chapter06.lesson08;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/test-a-square-that-decreases-with-heat/description">LINK</a>
 */
public class TestASquareThatDecreasesWithHeat {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      for (int j = n; j > 0; j--) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }
}
