package org.imjihye.trail01.chapter08.lesson01;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-ave-of-array/description">LINK</a>
 */
public class ChallengeAveOfArray {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int[][] arr = new int[2][4];

    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 4; j++) {
        arr[i][j] = sc.nextInt();
      }
    }

    // 가로 평균
    for (int i = 0; i < 2; i++) {
      int total = 0;
      for (int j = 0; j < 4; j++) {
        total += arr[i][j];
      }
      System.out.printf("%.1f ", total / 4.0);
    }
    System.out.println();

    // 세로 평균
    for (int j = 0; j < 4; j++) {
      int total = 0;
      for (int i = 0; i < 2; i++) {
        total += arr[i][j];
      }
      System.out.printf("%.1f ", total / 2.0);
    }
    System.out.println();

    // 전체 평균
    int total = 0;
    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 4; j++) {
        total += arr[i][j];
      }
    }
    System.out.printf("%.1f ", total / 8.0);
  }
}
