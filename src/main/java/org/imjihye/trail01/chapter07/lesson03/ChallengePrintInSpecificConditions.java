package org.imjihye.trail01.chapter07.lesson03;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-print-in-specific-conditions/description">LINK</a>
 */
public class ChallengePrintInSpecificConditions {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int[] arr = new int[100];
    int zeroPoint = 0;

    for (int i = 0; i < 100; i++) {
      arr[i] = sc.nextInt();

      if (arr[i] == 0) {
        zeroPoint = i;
        break;
      }
    }

    for (int i = 0; i < zeroPoint; i++) {
      if (arr[i] % 2 == 1)
        System.out.print(arr[i] + 3 + " ");
      else
        System.out.print(arr[i] / 2 + " ");
    }
  }
}
