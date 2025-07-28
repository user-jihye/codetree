package org.imjihye.trail01.chapter05.lesson17;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-factorization-discriminator/description">LINK</a>
 */
public class ChallengeFactorizationDiscriminator {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    boolean satisfied = false;

    for (int i = 2; i <= n-1; i++) {
      if (n % i == 0)
        satisfied = true;
    }

    if (satisfied)
      System.out.println('C');
    else
      System.out.println('N');
  }
}
