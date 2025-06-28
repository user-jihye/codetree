package org.imjihye.trail00.chapter10.lesson04;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/nl-pre-2d-array-pattern-printing-2/description">LINK</a>
 */
public class NlPre2dArrayPatternPrinting2 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] arr = new int[n][n];

    for (int j = 0; j < n; j++) {
      int num = 1;
      if (j % 2 == 0) {
        for (int i = 0; i < n; i++) {
          arr[i][j] = num++;
        }
      } else {
        for (int i = n-1; i >= 0; i--) {
          arr[i][j] = num++;
        }
      }
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print(arr[i][j]);
      }
      System.out.println();
    }

  }
}
