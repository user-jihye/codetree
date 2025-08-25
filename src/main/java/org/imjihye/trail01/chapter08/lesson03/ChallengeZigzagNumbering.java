package org.imjihye.trail01.chapter08.lesson03;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-zigzag-numbering/description">LINK</a>
 */
public class ChallengeZigzagNumbering {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n, m, num = 0;
    n = sc.nextInt();
    m = sc.nextInt();
    int[][] arr = new int[n][m];

    for (int x = 0; x < m; x++) {
      if (x % 2 == 0) {
        for (int y = 0; y < n; y++) {
          arr[y][x] = num;
          num++;
        }
      } else {
        for (int y = n-1; y >= 0; y--) {
          arr[y][x] = num;
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
