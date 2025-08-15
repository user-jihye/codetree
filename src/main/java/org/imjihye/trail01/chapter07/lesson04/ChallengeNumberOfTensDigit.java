package org.imjihye.trail01.chapter07.lesson04;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-number-of-tens-digit/description">LINK</a>
 */
public class ChallengeNumberOfTensDigit {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] cntArr = new int[10];

    for (int i = 0; i < 100; i++) {
      int x = sc.nextInt();

      if (x == 0)
        break;

      int tens = x / 10;
      cntArr[tens]++;
    }

    for (int i = 1; i <= 9; i++) {
      System.out.println(i + " - " + cntArr[i]);
    }

  }
}
