package org.imjihye.trail01.chapter02.lesson05;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-print-number--and-letter/description">LINK</a>
 */
public class ChallengePrintNumberAndLetter {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char c = sc.next().charAt(0);
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    System.out.printf("%c\n%.2f\n%.2f", c, a, b);
  }
}
