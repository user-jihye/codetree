package org.imjihye.trail01.chapter07.lesson02;

import java.util.*;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/intro-numbers-in-specific-location/description">LINK</a>
 */
public class IntroNumbersInSpecificLocation {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int[] arr = new int[10];

    for (int i = 0; i < 10; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.print(arr[2] + arr[4] + arr[9]);
  }
}
