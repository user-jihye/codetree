package org.imjihye.trail01.chapter04.lesson09;

import java.util.Scanner;

import static java.lang.Math.min;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-specific-comparison-of-three-natural-numbers/description">LINK</a>
 */
public class ChallengeSpecificComparisonOfThreeNaturalNumbers {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int a, b, c;
    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();

    if (a <= b && a <= c) {
      System.out.print("1 ");
    } else {
      System.out.print("0 ");
    }

    if (a == b && b == c) {
      System.out.print(1);
    } else {
      System.out.print(0);
    }
  }
}
