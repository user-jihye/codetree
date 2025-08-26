package org.imjihye.trail01.chapter08.lesson03;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-diagonal-numbering/description">LINK</a>
 */
public class ChallengeDiagonalNumbering {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n, m, num = 1;
    n = sc.nextInt();
    m = sc.nextInt();

    int col, row;
    int[][] arr = new int[n][m];
    for (int x = 0; x < m; x++) {
      if (x == m - 1) {
        for (int y = 0; y < n; y++) {
          row = y;
          col = x;
          while (row < n && col >= 0) {
            arr[row][col] = num;
            row++;
            col--;
            num++;
          }
        }

      } else {
        row = 0;
        col = x;
        while (row < n && col >= 0) {
          arr[row][col] = num;
          row++;
          col--;
          num++;
        }
      }
    }

    for (int y = 0; y < n; y++) {
      for (int x = 0; x < m; x++) {
        System.out.print(arr[y][x] + " ");
      }
      System.out.println();
    }
  }
}
