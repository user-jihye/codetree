package org.imjihye.trail01.chapter07.lesson06;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-leftmost-max-value/description">LINK</a>
 */
public class ChallengeLeftmostMaxValue {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    int first = n, second = n;
    while (first > 0) {
      int max = Integer.MIN_VALUE;
      for (int i = 0; i < first; i++) {
        if (arr[i] > max) {
          max = arr[i];
          second = i;
        }
      }

      System.out.print((second + 1) + " ");
      first = second;

    }
  }
}
