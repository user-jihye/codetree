package org.imjihye.trail01.chapter05.lesson15;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-catching-specific-number/description">LINK</a>
 */
public class ChallengeCatchingSpecificNumber {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (true) {
      int n = sc.nextInt();

      if (n < 25) {
        System.out.println("Higher");
      } else if (n > 25) {
        System.out.println("Lower");
      } else {
        System.out.println("Good");
        break;
      }
    }
  }
}
