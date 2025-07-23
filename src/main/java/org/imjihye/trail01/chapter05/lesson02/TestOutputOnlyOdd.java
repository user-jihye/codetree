package org.imjihye.trail01.chapter05.lesson02;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/test-output-only-odd/description">LINK</a>
 */
public class TestOutputOnlyOdd {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int a, b;
    a = sc.nextInt();
    b = sc.nextInt();

    for (int i = a; i <= b; i += 2) {
      System.out.print(i + " ");
    }
  }
}
