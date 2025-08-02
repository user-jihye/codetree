package org.imjihye.trail01.chapter06.lesson09;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-square-with-odd-numbers/description">LINK</a>
 */
public class ChallengeSquareWithOddNumbers {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int num = 11;

    for (int y = 0; y < n; y++) {
      for (int x = 0; x < n; x++) {
        System.out.print(((x * 2) + (y * 2) + 11) + " ");
      }
      System.out.println();
    }
  }
}
