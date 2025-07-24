package org.imjihye.trail01.chapter05.lesson09;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/test-print-only-odd-numbers/description">LINK</a>
 */
public class TestPrintOnlyOddNumbers {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      int num = sc.nextInt();
      if (num % 2 == 1 && num % 3 == 0) {
        System.out.println(num);
      }
    }
  }
}
