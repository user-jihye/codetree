package org.imjihye.trail01.chapter07.lesson01;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-filling-array/description">LINK</a>
 */
public class ChallengeFillingArray {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[10];
    int start = 9;

    for (int i = 0; i < 10; i++) {
      int x = sc.nextInt();

      if (x == 0) {
        start = i - 1;
        break;
      }

      arr[i] = x;
    }

    for (int i = start; i >= 0; i--) {
      System.out.print(arr[i] + " ");
    }

  }
}
