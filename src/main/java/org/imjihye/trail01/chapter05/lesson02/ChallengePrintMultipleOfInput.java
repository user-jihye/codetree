package org.imjihye.trail01.chapter05.lesson02;

import java.util.*;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-print-multiple-of-input/description">LINK</a>
 */
public class ChallengePrintMultipleOfInput {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int i = n; i <= 5*n; i += n) {
      System.out.print(i + " ");
    }
  }
}
