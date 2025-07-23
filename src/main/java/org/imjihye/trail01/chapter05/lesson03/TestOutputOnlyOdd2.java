package org.imjihye.trail01.chapter05.lesson03;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/test-output-only-odd-2/description">LINK</a>
 */
public class TestOutputOnlyOdd2 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int a, b;
    b = sc.nextInt();
    a = sc.nextInt();

    for (int i = b; i >= a; i -= 2) {
      System.out.print(i + " ");
    }
  }
}
