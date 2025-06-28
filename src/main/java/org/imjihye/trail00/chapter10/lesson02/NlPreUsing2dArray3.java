package org.imjihye.trail00.chapter10.lesson02;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/nl-pre-using-2d-array-3/description">LINK</a>
 */
public class NlPreUsing2dArray3 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int row = sc.nextInt();
    int col = sc.nextInt();

    int[][] matrix1 = new int[row][col];
    int[][] matrix2 = new int[row][col];

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        matrix1[i][j] = sc.nextInt();
      }
    }

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        matrix2[i][j] = sc.nextInt();
      }
    }

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        if (matrix1[i][j] == matrix2[i][j]) {
          System.out.print("0 ");
        } else {
          System.out.print("1 ");
        }
      }
      System.out.println();
    }
  }
}
