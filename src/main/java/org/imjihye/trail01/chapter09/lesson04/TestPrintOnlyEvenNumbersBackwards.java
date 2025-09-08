package org.imjihye.trail01.chapter09.lesson04;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/test-print-only-even-numbers-backwards/description">LINK</a>
 */
public class TestPrintOnlyEvenNumbersBackwards {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String str = sc.next();

    String result = "";
    for (int i = str.length() - 1; i >= 0; i--) {
      if (i % 2 == 1) {
        result += str.charAt(i);
      }
    }

    System.out.println(result);
  }
}
