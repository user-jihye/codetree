package org.imjihye.trail01.chapter06.lesson16;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-get-prime/description">LINK</a>
 */
public class ChallengeGetPrime {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int i = 1; i <= n; i++) {
      int cnt = 0;

      for (int j = 1; j <= i; j++) {
        if (i % j == 0)
          cnt++;
      }

      if (cnt == 2)
        System.out.print(i + " ");
    }
  }
}
