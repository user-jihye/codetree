package org.imjihye.trail01.chapter08.lesson02;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/test-compare-two-grid/description">LINK</a>
 */
public class TestCompareTwoGrid {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n, m;
    n = sc.nextInt();
    m = sc.nextInt();

    int[][] arr1 = new int[n][m];
    int[][] arr2 = new int[n][m];
    int[][] arr3 = new int[n][m];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        arr1[i][j] = sc.nextInt();
      }
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        arr2[i][j] = sc.nextInt();
      }
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (arr1[i][j] == arr2[i][j])
          arr3[i][j] = 0;
        else
          arr3[i][j] = 1;
      }
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        System.out.print(arr3[i][j] + " ");
      }
      System.out.println();
    }

  }
}
