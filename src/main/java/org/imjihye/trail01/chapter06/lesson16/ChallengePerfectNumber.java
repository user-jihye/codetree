package org.imjihye.trail01.chapter06.lesson16;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-perfect-number/description">LINK</a>
 */
public class ChallengePerfectNumber {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int start, end, cnt = 0;
    start = sc.nextInt();
    end = sc.nextInt();

    for (int i = start; i <= end; i++) {
      int sum = 0;

      for (int j = 1; j < i; j++) {
        if (i % j == 0)
          sum += j;
      }

      if (sum == i)
        cnt++;
    }

    System.out.println(cnt);
  }
}
