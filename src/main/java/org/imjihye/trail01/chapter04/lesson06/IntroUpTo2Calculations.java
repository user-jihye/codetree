package org.imjihye.trail01.chapter04.lesson06;

import java.util.*;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/intro-up-to-2-calculations/description">LINK</a>
 */
public class IntroUpTo2Calculations {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();

    if (a % 2 == 0) {
      a /= 2;
    }

    if (a % 2 == 1) {
      a = (a + 1) / 2;
    }

    System.out.println(a);
  }
}
