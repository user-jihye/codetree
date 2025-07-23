package org.imjihye.trail01.chapter05.lesson05;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/test-output-only-even/description">LINK</a>
 */
public class TestOutputOnlyEven {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int a, b;
    a = sc.nextInt();
    b = sc.nextInt();

    while (a <= b) {
      System.out.print(a + " ");
      a += 2;
    }
  }
}
