package org.imjihye.trail00.chapter10.lesson02;

import java.util.*;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/nl-pre-using-2d-array-1/description">LINK</a>
 */
public class NlPreUsing2dArray1 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int[][] matrix = new int[3][3];

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        matrix[i][j] = sc.nextInt() * 3;
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }
}
