package org.imjihye.trail00.chapter10.lesson02;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/nl-pre-using-2d-array-2/description">LINK</a>
 */
public class NlPreUsing2dArray2 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int[][] matrix1 = new int[3][3];
    int[][] matrix2 = new int[3][3];

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        matrix1[i][j] = sc.nextInt();
      }
    }

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        matrix2[i][j] = sc.nextInt();
      }
    }

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print((matrix1[i][j] * matrix2[i][j]) + " ");
      }
      System.out.println();
    }
  }
}
