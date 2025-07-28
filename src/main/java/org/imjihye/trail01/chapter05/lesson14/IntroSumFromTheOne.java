package org.imjihye.trail01.chapter05.lesson14;

import java.util.*;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/intro-sum-from-the-one/description">LINK</a>
 */
public class IntroSumFromTheOne {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n, sum = 0;
    n = sc.nextInt();

    for (int i = 1; i <= 100; i++) {
      sum += i;

      if (sum >= n) {
        System.out.println(i);
        break;
      }
    }
  }
}
