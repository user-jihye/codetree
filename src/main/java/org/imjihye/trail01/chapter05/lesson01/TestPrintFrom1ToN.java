package org.imjihye.trail01.chapter05.lesson01;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/test-print-from-1-to-n/description">LINK</a>
 */
public class TestPrintFrom1ToN {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int i = 1; i <= n; i++) {
      System.out.print(i + " ");
    }
  }
}
