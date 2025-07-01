package org.imjihye.trail01.chapter02.lesson04;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-calculation-by-inputting-a-real-number/description">LINK</a>
 */
public class ChallengeCalculationByInputtingARealNumber {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    System.out.printf("%.2f", (a + b));
  }
}
