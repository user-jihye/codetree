package org.imjihye.trail01.chapter05.lesson09;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-a-to-b/description">LINK</a>
 */
public class ChallengeAToB {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a, b;
    a = sc.nextInt();
    b = sc.nextInt();

    while (a <= b) {
      System.out.print(a+ " ");
      if (a % 2 == 1) {
        a *= 2;
      } else {
        a += 3;
      }
    }
  }
}
