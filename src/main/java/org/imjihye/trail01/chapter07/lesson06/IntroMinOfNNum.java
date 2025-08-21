package org.imjihye.trail01.chapter07.lesson06;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/intro-min-of-n-num/description">LINK</a>
 */
public class IntroMinOfNNum {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    final int INT_MAX = Integer.MAX_VALUE;
    int minVal, cnt = 0;
    minVal = INT_MAX;
    for (int i = 0; i < n; i++) {

      if (arr[i] == minVal)
        cnt++;

      if (arr[i] < minVal) {
        minVal = arr[i];
        cnt = 1;
      }
    }

    System.out.println(minVal + " " + cnt);
  }
}
