package org.imjihye.trail01.chapter08.lesson01;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-change-to-capital/description">LINK</a>
 */
public class ChallengeChangeToCapital {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 3; j++) {
        char x = sc.next().charAt(0);
        System.out.print((char) (x - 32) + " ");
      }
      System.out.println();
    }

  }
}
