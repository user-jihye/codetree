package org.imjihye.trail01.chapter08.lesson04;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/test-print-grid-in-rectangle/description">LINK</a>
 */
public class TestPrintGridInRectangle {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] arr = new int[n][n];

    for (int i = 0; i < n; i++)
      arr[i][0] = 1;

    for (int j = 0; j < n; j++)
      arr[0][j] = 1;

    for (int i = 1; i < n; i++) {
      for (int j = 1; j < n; j++) {
        arr[i][j] = arr[i-1][j] + arr[i][j-1] + arr[i-1][j-1];
      }
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }
}
