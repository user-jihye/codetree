package org.imjihye.trail01.chapter05.lesson11;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-multiplication-between-numbers/description">LINK</a>
 */
public class ChallengeMultiplicationBetweenNumbers {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a, b, sumVal = 0, cnt = 0;
    a = sc.nextInt();
    b = sc.nextInt();
    double avg;

    for (int i = a; i <= b; i++) {
      if (i % 5 == 0 || i % 7 == 0) {
        sumVal += i;
        cnt++;
      }
    }
    avg = (double) sumVal / cnt;
    System.out.printf("%d %.1f", sumVal, avg);
  }
}
