package org.imjihye.trail01.chapter05.lesson12;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-a-to-the-power-of-b/description">LINK</a>
 */
public class ChallengeAToThePowerOfB {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a, b, prod = 1;
    a = sc.nextInt();
    b = sc.nextInt();

    for (int i = 0; i < b; i++) {
      prod *= a;
    }

    System.out.println(prod);
  }
}
