package org.imjihye.trail01.chapter04.lesson12;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-number-of-days-in-month/description">LINK</a>
 */
public class ChallengeNumberOfDaysInMonth {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int y = sc.nextInt();

    if (y == 2) {
      System.out.println(28);
    } else if (y == 1 || y == 3 || y == 5 || y == 7 || y == 8 || y == 10 || y == 12) {
      System.out.println(31);
    } else {
      System.out.println(30);
    }
  }
}
