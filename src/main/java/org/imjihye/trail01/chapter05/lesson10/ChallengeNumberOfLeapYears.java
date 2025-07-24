package org.imjihye.trail01.chapter05.lesson10;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-number-of-leap-years/description">LINK</a>
 */
public class ChallengeNumberOfLeapYears {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int cnt = 0;
    for (int i = 1; i <= n; i++) {
      if (i % 4 == 0 && !(i % 100 == 0 && i % 400 != 0)) {
        cnt++;
      }
    }

    System.out.println(cnt);
  }
}
