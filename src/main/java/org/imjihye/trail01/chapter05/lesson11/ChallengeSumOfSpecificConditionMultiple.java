package org.imjihye.trail01.chapter05.lesson11;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-sum-of-specific-condition-multiple/description">LINK</a>
 */
public class ChallengeSumOfSpecificConditionMultiple {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a, b, start, end, sum = 0;
    a = sc.nextInt();
    b = sc.nextInt();

    if (a < b) {
      start = a;
      end = b;
    } else {
      start = b;
      end = a;
    }

    for (int i = start; i <= end; i++) {
      if (i % 5 == 0) {
        sum += i;
      }
    }

    System.out.println(sum);
  }
}
