package org.imjihye.trail01.chapter04.lesson07;

import java.util.*;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-specific-comparison-of-two-natural-numbers/description">LINK</a>
 */
public class ChallengeSpecificComparisonOfTwoNaturalNumbers {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();

    if (a < b) {
      System.out.print(1 + " ");
    } else {
      System.out.print(0 + " ");
    }

    if (a == b) {
      System.out.print(1);
    } else {
      System.out.print(0);
    }
  }
}
