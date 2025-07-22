package org.imjihye.trail01.chapter04.lesson09;

import java.util.*;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/intro-number-in-range/description">LINK</a>
 */
public class IntroNumberInRange {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();

    if (a >= 10 && a <= 20) {
      System.out.print("yes");
    } else {
      System.out.print("no");
    }
  }
}
