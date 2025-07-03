package org.imjihye.trail01.chapter03.lesson01;

import java.util.*;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/test-divide-of-sum-and-sub/description">LINK</a>
 */
public class TestDivideOfSumAndSub {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();

    System.out.printf("%.2f", (double) (a + b) / (a - b));
  }
}
