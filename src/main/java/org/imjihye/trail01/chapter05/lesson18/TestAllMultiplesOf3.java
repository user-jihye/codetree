package org.imjihye.trail01.chapter05.lesson18;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/test-all-multiples-of-3/description">LINK</a>
 */
public class TestAllMultiplesOf3 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    boolean satisfied = true;

    for (int i = 0; i < 5; i++) {
      int n = sc.nextInt();

      if (n % 3 != 0) {
        satisfied = false;
      }
    }

    if (satisfied) {
      System.out.println(1);
    } else {
      System.out.println(0);
    }
  }
}
