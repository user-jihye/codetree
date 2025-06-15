package org.imjihye.trail00.chapter06.lesson02;

import java.util.*;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/nl-pre-1d-array-iteration-2/description">LINK</a>
 */
public class NlPre1dArrayIteration2 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int[] nums = new int[n];

    for (int i = 0; i < n; i++) {
      nums[i] = sc.nextInt();
    }

    for (int i = 0; i < n; i++) {
      System.out.print((nums[i] * nums[i]) + " ");
    }
  }
}
