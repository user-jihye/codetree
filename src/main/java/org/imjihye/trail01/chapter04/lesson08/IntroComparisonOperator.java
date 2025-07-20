package org.imjihye.trail01.chapter04.lesson08;

import java.util.*;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/intro-comparison-operator/description">LINK</a>
 */
public class IntroComparisonOperator {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a, b;
    a = sc.nextInt();
    b = sc.nextInt();

    System.out.println(a >= b ? 1 : 0 );
    System.out.println(a > b ? 1 : 0);
    System.out.println(a <= b ? 1 : 0);
    System.out.println(a < b ? 1 : 0);
    System.out.println(a == b ? 1 : 0);
    System.out.println(a != b ? 1 : 0);
  }
}
