package org.imjihye.trail01.chapter06.lesson05;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-star-drawing/description">LINK</a>
 */
public class ChallengeStarDrawing {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        System.out.print(" ");
      }
      for (int j = 0; j < 2 * i + 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    for (int i = 1; i < n; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print(" ");
      }
      for (int j = 0; j < 2 * (n - i) - 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
