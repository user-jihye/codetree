package org.imjihye.trail01.chapter07.lesson06;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/test-minimum-difference-between-two-numbers/description">LINK</a>
 */
public class TestMinimumDifferenceBetweenTwoNumbers {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < n; i++)
      arr[i] = sc.nextInt();

    int minDif = Integer.MAX_VALUE;
    for (int i = 1; i < n ; i++) {
      if (minDif > arr[i] - arr[i-1])
        minDif = arr[i] - arr[i-1];
    }
    System.out.println(minDif);
  }
}
