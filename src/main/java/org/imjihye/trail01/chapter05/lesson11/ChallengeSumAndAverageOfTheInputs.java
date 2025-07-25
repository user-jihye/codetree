package org.imjihye.trail01.chapter05.lesson11;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-sum-and-average-of-the-inputs/description">LINK</a>
 */
public class ChallengeSumAndAverageOfTheInputs {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n, sum = 0;
    double avg;
    n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      int num = sc.nextInt();
      sum += num;
    }

    avg = (double) sum /n;
    System.out.printf("%d %.1f", sum, avg);
  }
}
