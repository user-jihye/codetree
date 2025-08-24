package org.imjihye.trail01.chapter05.lesson09;

import java.util.*;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/intro-multiple-of-a/description">LINK</a>
 */
public class IntroMultipleOfA {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int N, a, i = 1;
    N = sc.nextInt();
    a = sc.nextInt();

    while (i <= N) {

      if (i % a == 0)
        System.out.println(1);
      else
        System.out.println(0);

      i++;
    }
  }
}
