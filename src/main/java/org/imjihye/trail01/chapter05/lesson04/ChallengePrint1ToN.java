package org.imjihye.trail01.chapter05.lesson04;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-print-1-to-n/description">LINK</a>
 */
public class ChallengePrint1ToN {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int i = 1;

    while (i <= n) {
      System.out.print(i + " ");
      i++;
    }
  }
}
