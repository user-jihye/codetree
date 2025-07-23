package org.imjihye.trail01.chapter05.lesson08;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/test-output-only-natural-number/description">LINK</a>
 */
public class TestOutputOnlyNaturalNumber {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a, b;
    a = sc.nextInt();
    b = sc.nextInt();

    if (a > 0) {
      for (int i = 0; i < b; i++) {
        System.out.print(a);
      }
    } else {
      System.out.print(0);
    }
  }
}
