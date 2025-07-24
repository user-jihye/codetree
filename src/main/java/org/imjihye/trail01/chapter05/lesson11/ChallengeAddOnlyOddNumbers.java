package org.imjihye.trail01.chapter05.lesson11;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-add-only-odd-numbers/description">LINK</a>
 */
public class ChallengeAddOnlyOddNumbers {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int sumVal = 0;
    for (int i = 0; i < n; i++) {
      int num = sc.nextInt();
      if (num % 2 == 1 && num % 3 == 0) {
        sumVal += num;
      }
    }
    System.out.println(sumVal);
  }
}
