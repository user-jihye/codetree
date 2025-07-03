package org.imjihye.trail01.chapter03.lesson02;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/intro-sum-and-avg/description">LINK</a>
 */
public class IntroSumAndAvg {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    int sum = a + b;
    double avg = (double)sum / 2;

    System.out.printf("%d %.1f", sum, avg);
  }
}
