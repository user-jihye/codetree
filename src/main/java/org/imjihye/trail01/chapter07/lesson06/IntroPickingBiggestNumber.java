package org.imjihye.trail01.chapter07.lesson06;

import java.util.*;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/intro-picking-biggest-number/description">LINK</a>
 */
public class IntroPickingBiggestNumber {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int[] arr = new int[10];
    for (int i = 0; i < 10; i++) {
      arr[i] = sc.nextInt();
    }

    final int INT_MIN = Integer.MIN_VALUE;
    int maxVal = INT_MIN;
    for (int i = 0; i < 10; i++) {
      if (arr[i] > maxVal)
        maxVal = arr[i];
    }

    System.out.println(maxVal);
  }
}
