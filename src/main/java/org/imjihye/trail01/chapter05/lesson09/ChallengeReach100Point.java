package org.imjihye.trail01.chapter05.lesson09;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-reach-100-point/description">LINK</a>
 */
public class ChallengeReach100Point {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    for (int i = N; i <= 100; i++) {
      if (i >= 90) {
        System.out.print("A ");
      } else if (i >= 80) {
        System.out.print("B ");
      } else if (i >= 70) {
        System.out.print("C ");
      } else if (i >= 60) {
        System.out.print("D ");
      } else {
        System.out.print("F ");
      }
    }
  }
}
