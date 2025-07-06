package org.imjihye.trail01.chapter04.lesson02;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-numbers-condition/description">LINK</a>
 */
public class ChallengeNumbersCondition {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();

    if (a >= 113)
      System.out.print(1);
    else
      System.out.print(0);
  }
}
