package org.imjihye.trail01.chapter04.lesson09;

import java.util.*;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/test-median-of-three-numbers/description">LINK</a>
 */
public class TestMedianOfThreeNumbers {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int a, b, c;
    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();

    if (b > a && b < c) {
      System.out.println(1);
    } else {
      System.out.println(0);
    }
  }
}
