package org.imjihye.trail01.chapter07.lesson06;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-two-max-of-n-num/description">LINK</a>
 */
public class ChallengeTwoMaxOfNNum {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    final int MIN_INT = Integer.MIN_VALUE;
    int first, second;
    first = MIN_INT;
    second = MIN_INT;

    for (int i = 0; i <n; i++) {
      if (arr[i] > first) {
        second = first;
        first = arr[i];
      } else if (arr[i] > second) {
        second = arr[i];
      }
    }

    System.out.println(first + " " + second);
  }
}
