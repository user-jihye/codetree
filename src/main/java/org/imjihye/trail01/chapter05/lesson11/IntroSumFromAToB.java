package org.imjihye.trail01.chapter05.lesson11;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/intro-sum-from-a-to-b/description">LINK</a>
 */
public class IntroSumFromAToB {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int a, b;
    a = sc.nextInt();
    b = sc.nextInt();

    int sumVal = 0;

    for (int i = a; i <= b; i++) {
      sumVal += i;
    }

    System.out.println(sumVal);
  }
}
