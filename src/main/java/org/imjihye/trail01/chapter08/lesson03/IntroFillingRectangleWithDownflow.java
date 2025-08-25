package org.imjihye.trail01.chapter08.lesson03;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/intro-filling-rectangle-with-downflow/description">LINK</a>
 */
public class IntroFillingRectangleWithDownflow {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] arr = new int[n][n];

    int num = 1;
    for (int j = 0; j < n; j++) {
      for (int i = 0; i < n; i++) {
        arr[i][j] = num;
        num++;
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
