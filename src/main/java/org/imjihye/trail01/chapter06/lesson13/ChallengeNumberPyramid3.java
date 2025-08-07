package org.imjihye.trail01.chapter06.lesson13;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-number-pyramid-3/description">LINK</a>
 */
public class ChallengeNumberPyramid3 {

  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int n = sc.nextInt();

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(i * j + " ");
      }
      System.out.println();
    }
  }
}
