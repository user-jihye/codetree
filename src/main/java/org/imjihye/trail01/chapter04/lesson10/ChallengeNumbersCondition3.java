package org.imjihye.trail01.chapter04.lesson10;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-numbers-condition-3/description">LINK</a>
 */
public class ChallengeNumbersCondition3 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();

    if (a % 13 == 0 || a % 19 == 0) {
      System.out.println("True");
    } else {
      System.out.println("False");
    }
  }
}
