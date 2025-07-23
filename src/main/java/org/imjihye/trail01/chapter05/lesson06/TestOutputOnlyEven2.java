package org.imjihye.trail01.chapter05.lesson06;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/test-output-only-even-2/description">LINK</a>
 */
public class TestOutputOnlyEven2 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int a, b;
    b = sc.nextInt();
    a = sc.nextInt();

    while (b >= a) {
      System.out.print(b + " ");
      b -= 2;
    }
  }
}
