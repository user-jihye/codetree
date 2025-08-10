package org.imjihye.trail01.chapter07.lesson01;

import java.util.*;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/intro-sum-of-10-elements/description">LINK</a>
 */
public class IntroSumOf10Elements {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int[] arr = new int[10];
    int sum = 0;

    for (int i = 0; i < 10; i++) {
      arr[i] = sc.nextInt();
      sum += arr[i];
    }

    System.out.println(sum);
  }
}
