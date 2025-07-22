package org.imjihye.trail01.chapter04.lesson10;

import java.util.*;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/intro-number-out-of-range/description">LINK</a>
 */
public class IntroNumberOutOfRange {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();

    if (a < 10 || a > 20) {
      System.out.println("yes");
    } else {
      System.out.println("no");
    }
  }
}
