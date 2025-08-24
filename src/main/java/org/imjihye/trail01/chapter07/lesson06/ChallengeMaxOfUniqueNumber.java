package org.imjihye.trail01.chapter07.lesson06;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-max-of-unique-number/description">LINK</a>
 */
public class ChallengeMaxOfUniqueNumber {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[1001];

    for (int i = 0; i < n; i++) {
      int x = sc.nextInt();
      arr[x]++;
    }

    int max = -1;
    for (int i = 1000; i >= 0; i--) {
      if (arr[i] == 1) {
        max = i;
        break;
      }
    }

    System.out.println(max);
  }
}
