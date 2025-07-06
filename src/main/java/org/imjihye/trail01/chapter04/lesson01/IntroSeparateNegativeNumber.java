package org.imjihye.trail01.chapter04.lesson01;

import java.util.*;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/intro-separate-negative-number/description">LINK</a>
 */
public class IntroSeparateNegativeNumber {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    System.out.println(n);
    if (n < 0)
      System.out.println("minus");
  }
}
