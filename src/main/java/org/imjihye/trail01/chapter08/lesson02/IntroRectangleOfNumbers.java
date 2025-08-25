package org.imjihye.trail01.chapter08.lesson02;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/intro-rectangle-of-numbers/description">LINK</a>
 */
public class IntroRectangleOfNumbers {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n, m;
    n = sc.nextInt();
    m = sc.nextInt();
    int[][] arr = new int[n][m];

    int num = 1;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        arr[i][j] = num;
        num++;
      }
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }


  }
}
