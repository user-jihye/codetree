package org.imjihye.trail01.chapter08.lesson05;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/intro-Where-coins-are-located/description">LINK</a>
 */
public class IntroWhereCoinsAreLocated {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[][] arr = new int[n][n];

    for (int i = 0; i < m; i++) {
      int row = sc.nextInt();
      int col = sc.nextInt();
      arr[row-1][col-1] = 1;
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }
}
