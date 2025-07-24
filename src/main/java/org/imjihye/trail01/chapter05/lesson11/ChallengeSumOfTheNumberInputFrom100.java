package org.imjihye.trail01.chapter05.lesson11;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-sum-of-the-number-input-from-100/description">LINK</a>
 */
public class ChallengeSumOfTheNumberInputFrom100 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int sumVal = 0;

    for (int i = n; i <= 100; i++) {
      sumVal += i;
    }

    System.out.println(sumVal);
  }
}
