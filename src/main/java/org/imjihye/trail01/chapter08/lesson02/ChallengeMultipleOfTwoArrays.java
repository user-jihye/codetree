package org.imjihye.trail01.chapter08.lesson02;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-multiple-of-two-arrays/description">LINK</a>
 */
public class ChallengeMultipleOfTwoArrays {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int[][] arr1 = new int[3][3];
    int[][] arr2 = new int[3][3];

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        arr1[i][j] = sc.nextInt();
      }
    }

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        arr2[i][j] = sc.nextInt();
      }
    }

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print(arr1[i][j] * arr2[i][j] + " ");
      }
      System.out.println();
    }
  }
}
