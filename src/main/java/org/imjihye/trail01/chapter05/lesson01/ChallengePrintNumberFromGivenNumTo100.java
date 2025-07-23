package org.imjihye.trail01.chapter05.lesson01;

import java.util.*;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-print-number-from-given-num-to-100/description">LINK</a>
 */
public class ChallengePrintNumberFromGivenNumTo100 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int i = n; i <= 100; i++) {
      System.out.print(i + " ");
    }
  }
}
