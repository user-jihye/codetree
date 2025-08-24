package org.imjihye.trail01.chapter08.lesson01;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/intro-sum-of-array/description">LINK</a>
 */
public class IntroSumOfArray {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < 4; i++) {
      int sumVal = 0;
      for (int j = 0; j < 4; j++) {
        sumVal += sc.nextInt();
      }
      System.out.println(sumVal);
    }
  }
}
