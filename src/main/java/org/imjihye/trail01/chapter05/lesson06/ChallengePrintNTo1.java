package org.imjihye.trail01.chapter05.lesson06;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-print-n-to-1/description">LINK</a>
 */
public class ChallengePrintNTo1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc. nextInt();

    while (n >= 1) {
      System.out.print(n + " ");
      n--;
    }
  }
}
