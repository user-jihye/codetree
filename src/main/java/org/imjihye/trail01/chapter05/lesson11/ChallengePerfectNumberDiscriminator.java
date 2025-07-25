package org.imjihye.trail01.chapter05.lesson11;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-perfect-number-discriminator/description">LINK</a>
 */
public class ChallengePerfectNumberDiscriminator {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sum = 0;

    for (int i = 1; i < n; i++) {
      if (n % i == 0) {
        sum += i;
      }
    }

    System.out.println(sum == n ? 'P' : 'N');
  }
}
