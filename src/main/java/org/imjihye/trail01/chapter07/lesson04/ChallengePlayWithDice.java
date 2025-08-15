package org.imjihye.trail01.chapter07.lesson04;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-play-with-dice/description">LINK</a>
 */
public class ChallengePlayWithDice {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] arr = new int[10];
    int[] cntArr = new int[7];

    for (int i = 0; i < 10; i++) {
      arr[i] = sc.nextInt();
    }

    for (int i = 0; i < 10; i++) {
      cntArr[arr[i]]++;
    }

    for (int i = 1; i < 7; i++) {
      System.out.println(i + " - " + cntArr[i]);
    }
  }
}
