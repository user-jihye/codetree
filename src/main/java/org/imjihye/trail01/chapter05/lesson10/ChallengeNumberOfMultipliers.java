package org.imjihye.trail01.chapter05.lesson10;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-number-of-multipliers/description">LINK</a>
 */
public class ChallengeNumberOfMultipliers {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int multipleOf3 = 0;
    int multipleOf5 = 0;

    for (int i = 0; i < 10; i++) {
      int num = sc.nextInt();

      if (num % 3 == 0) {
        multipleOf3++;
      }

      if (num % 5 == 0) {
        multipleOf5++;
      }
    }

    System.out.println(multipleOf3 + " " + multipleOf5);
  }
}
