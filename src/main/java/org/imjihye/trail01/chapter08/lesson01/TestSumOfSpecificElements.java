package org.imjihye.trail01.chapter08.lesson01;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/test-sum-of-specific-elements/description">LINK</a>
 */
public class TestSumOfSpecificElements {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int[][] arr = new int[4][4];

    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
        arr[i][j] = sc.nextInt();
      }
    }

    int total = 0;
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j <= i; j++) {
        total += arr[i][j];
      }
    }

    System.out.println(total);
  }
}
