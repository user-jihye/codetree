package org.imjihye.trail01.chapter05.lesson18;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-prime-number-discriminator/description">LINK</a>
 */
public class ChallengePrimeNumberDiscriminator {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    boolean satisfied = true;

    for (int i = 2; i < n; i++) {
      if (n % i == 0) {
        satisfied = false;
      }
    }

    if (satisfied) {
      System.out.println('P');
    } else {
      System.out.println('C');
    }
  }
}
