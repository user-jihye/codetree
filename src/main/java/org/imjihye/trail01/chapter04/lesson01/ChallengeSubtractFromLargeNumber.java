package org.imjihye.trail01.chapter04.lesson01;

import java.util.*;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-subtract-from-large-number/description">LINK</a>
 */
public class ChallengeSubtractFromLargeNumber {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    if (a >= b) {
      System.out.print(a - b);
    } else {
      System.out.print(b - a);
    }
  }
}
