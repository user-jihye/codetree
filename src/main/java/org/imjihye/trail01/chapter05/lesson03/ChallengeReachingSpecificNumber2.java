package org.imjihye.trail01.chapter05.lesson03;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-reaching-specific-number-2/description">LINK</a>
 */
public class ChallengeReachingSpecificNumber2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int i = n; i >=1 ; i--) {
      System.out.print(i + " ");
    }
  }
}
