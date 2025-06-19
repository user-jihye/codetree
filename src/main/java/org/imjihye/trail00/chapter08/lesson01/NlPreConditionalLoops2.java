package org.imjihye.trail00.chapter08.lesson01;

import java.util.*;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/nl-pre-conditional-loops-2/description">LINK</a>
 */
public class NlPreConditionalLoops2 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] nums = new int[n];

    for (int i = 0; i < n; i++) {
      nums[i] = sc.nextInt();
    }

    for (int i = n-1; i >= 0; i--) {
      if (nums[i] % 2 == 0) {
        System.out.print(nums[i] + " ");
      }
    }
  }
}
