package org.imjihye.trail01.chapter07.lesson03;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-print-in-specific-conditions/description">LINK</a>
 */
public class ChallengePrintInSpecificConditions {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int[] arr = new int[100];
    int cnt = 0;

    for (int i = 0; i < 100; i++) {
      arr[i] = sc.nextInt();
      cnt++;

      if (arr[i] == 0)
        break;
    }

    for (int i = 0; i < cnt-1; i++) {
      if (arr[i] % 2 == 1)
        System.out.print(arr[i] + 3 + " ");
      else
        System.out.print(arr[i] / 2 + " ");
    }
  }
}
