package org.imjihye.trail01.chapter05.lesson05;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-print-multiple-of-number-three/description">LINK</a>
 */
public class ChallengePrintMultipleOfNumberThree {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n, i = 3;
    n = sc.nextInt();

    while (i <= n) {
      System.out.print(i + " ");
      i += 3;
    }
  }
}
