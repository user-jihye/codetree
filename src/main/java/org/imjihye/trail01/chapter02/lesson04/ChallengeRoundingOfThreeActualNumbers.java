package org.imjihye.trail01.chapter02.lesson04;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-rounding-of-three-actual-numbers/description">LINK</a>
 */
public class ChallengeRoundingOfThreeActualNumbers {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double c = sc.nextDouble();

    System.out.printf("%.3f\n", a);
    System.out.printf("%.3f\n", b);
    System.out.printf("%.3f", c);
  }
}
