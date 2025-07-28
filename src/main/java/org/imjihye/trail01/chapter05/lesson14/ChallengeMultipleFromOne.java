package org.imjihye.trail01.chapter05.lesson14;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-multiple-from-one/description">LINK</a>
 */
public class ChallengeMultipleFromOne {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n, prod = 1;
    n = sc.nextInt();

    for (int i = 1; i <= 10; i++) {
      prod *= i;

      if (prod >= n) {
        System.out.println(i);
        break;
      }
    }
  }
}
