package org.imjihye.trail01.chapter07.lesson06;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-near-500/description">LINK</a>
 */
public class ChallengeNear500 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int[] arr = new int[10];
    for (int i = 0; i < 10; i++) {
      arr[i] = sc.nextInt();
    }

    int maxInt = 1, minInt = 1000;
    for (int i = 0; i < 10; i++) {
      if (arr[i] < 500 && arr[i] > maxInt)
        maxInt = arr[i];
      else if (arr[i] > 500 && arr[i] < minInt)
        minInt = arr[i];
    }

    System.out.println(maxInt + " " + minInt);
  }
}
