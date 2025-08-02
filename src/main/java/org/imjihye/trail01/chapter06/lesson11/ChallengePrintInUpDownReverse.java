package org.imjihye.trail01.chapter06.lesson11;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-print-in-up-down-reverse/description">LINK</a>
 */
public class ChallengePrintInUpDownReverse {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] arr = new int[n][n];

    for (int x = 0; x < n; x++) {
      if (x % 2 == 0) {
        for (int y = 0; y < n; y++) {
          arr[x][y] = y + 1;
        }
      } else {
        for (int y = 0; y < n; y++) {
          arr[x][y] = n - y;
        }
      }
    }

    for (int y = 0; y < n; y++) {
       for (int x = 0; x < n; x++) {
         System.out.print(arr[x][y]);
       }
      System.out.println();
    }
  }
}
