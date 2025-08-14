package org.imjihye.trail01.chapter07.lesson03;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-print-even-number/description">LINK</a>
 */
public class ChallengePrintEvenNumber {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int j = 0;

    int[] arr = new int[n];
    int[] evenArr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();

      if (arr[i] % 2 == 0) {
        evenArr[j] = arr[i];
        j++;
      }
    }

    for (int i = 0; i < j; i++) {
      System.out.print(evenArr[i] + " ");
    }
  }
}
