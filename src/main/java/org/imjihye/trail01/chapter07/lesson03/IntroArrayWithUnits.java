package org.imjihye.trail01.chapter07.lesson03;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/intro-array-with-units/description">LINK</a>
 */
public class IntroArrayWithUnits {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int[] arr = new int[10];

    arr[0] = sc.nextInt();
    arr[1] = sc.nextInt();

    for (int i = 2; i < 10; i++) {
      arr[i] = (arr[i-2] + arr[i-1]) % 10;
    }

    for (int i = 0; i < 10; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
