package org.imjihye.trail01.chapter07.lesson03;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-multiple-of-numbers/description">LINK</a>
 */
public class ChallengeMultipleOfNumbers {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int[] arr = new int[100];
    int cnt = 0, j = 1;

    for (int i = 0; i < 100; i++) {
      arr[i] = x * j;
      j++;

      if (arr[i] % 5 == 0)
        cnt++;

      if (cnt == 2)
        break;
    }

    for (int i = 0; i < j - 1; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}