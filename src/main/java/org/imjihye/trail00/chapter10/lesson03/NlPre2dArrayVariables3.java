package org.imjihye.trail00.chapter10.lesson03;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/nl-pre-2d-array-variables-3/description">LINK</a>
 */
public class NlPre2dArrayVariables3 {

  public static void main(String[] args) {
    int[][] matrix = new int[4][4];

    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j<4; j++) {
        matrix[i][j] = sc.nextInt();
      }
    }

    int total = 0;
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j <= i; j++) {
        total += matrix[i][j];
      }
    }

    System.out.println(total);
  }
}
