package org.imjihye.trail01.chapter07.lesson01;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-print-average/description">LINK</a>
 */
public class ChallengePrintAverage {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double[] score = new double[8];
    for (int i = 0; i < 8; i++) {
      score[i] = sc.nextDouble();
    }

    double sumVal = 0;
    for (int i = 0; i < 8; i++) {
      sumVal += score[i];
    }

    double avg = sumVal / 8;
    System.out.printf("%.1f", avg);
  }
}
