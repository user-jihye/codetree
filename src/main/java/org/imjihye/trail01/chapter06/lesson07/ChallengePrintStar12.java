package org.imjihye.trail01.chapter06.lesson07;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-print-star-12/description">LINK</a>
 */
public class ChallengePrintStar12 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String[][] arr = new String[n][n];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        arr[i][j] = "  ";
      }
    }

    for (int j = 0; j < n; j++) {
      for (int i = 0; i <= j; i++) {
        if (j % 2 == 0) {
          arr[0][j] = "* ";
        } else {
          arr[i][j] = "* ";
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
