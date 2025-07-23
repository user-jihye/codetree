package org.imjihye.trail01.chapter05.lesson03;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-dec-from-b-to-a/description">LINK</a>
 */
public class ChallengeDecFromBToA {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int a, b;
    a = sc.nextInt();
    b = sc.nextInt();

    for (int i = b; i >= a; i--) {
      System.out.print(i + " ");
    }

  }
}
