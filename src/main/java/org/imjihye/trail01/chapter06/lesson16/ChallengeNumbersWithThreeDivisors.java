package org.imjihye.trail01.chapter06.lesson16;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-numbers-with-three-divisors/description">LINK</a>
 */
public class ChallengeNumbersWithThreeDivisors {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int start, end, result = 0;
    start = sc.nextInt();
    end = sc.nextInt();

    for (int i = start; i <= end; i++) {
      int cnt = 0;

      for (int j = 1; j <= i; j++) {
        if (i % j == 0)
          cnt++;
      }

      if (cnt == 3)
        result++;
    }
    System.out.println(result);
  }
}
