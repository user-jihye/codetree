package org.imjihye.trail01.chapter07.lesson01;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/intro-credit-calculator/description">LINK</a>
 */
public class IntroCreditCalculator {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    double sum = 0;

    double[] score = new double[5];

    for (int i = 0; i < n; i++) {
      score[i] = sc.nextDouble();
    }

    for (int i = 0; i < n; i++) {
      sum += score[i];
    }

    double avg = sum / n;
    System.out.printf("%.1f\n", avg);

    if (avg >= 4.0)
      System.out.println("Perfect");
    else if (avg >= 3.0)
      System.out.println("Good");
    else
      System.out.println("Poor");
  }
}
