package org.imjihye.trail01.chapter08.lesson03;

import java.util.*;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/test-grid-anti-fill/description">LINK</a>
 */
public class TestGridAntiFill {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] arr = new int[n][n];

    int num = 1;
    for (int x = n-1; x >= 0; x--) {
      if (n % 2 == 0) {
        if (x % 2 == 0) {
          for (int y = 0; y < n; y++) {
            arr[y][x] = num;
            num++;
          }
        } else {
          for (int y = n - 1; y >= 0; y--) {
            arr[y][x] = num;
            num++;
          }
        }
      } else {
        if (x % 2 == 1) {
          for (int y = 0; y < n; y++) {
            arr[y][x] = num;
            num++;
          }
        } else {
          for (int y = n - 1; y >= 0; y--) {
            arr[y][x] = num;
            num++;
          }
        }
      }
    }

    for (int y = 0; y < n; y++) {
      for (int x = 0; x < n; x++) {
        System.out.print(arr[y][x] + " ");
      }
      System.out.println();
    }
  }
}
