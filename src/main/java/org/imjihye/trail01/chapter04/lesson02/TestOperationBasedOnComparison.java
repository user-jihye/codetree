package org.imjihye.trail01.chapter04.lesson02;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/test-operation-based-on-comparison/description">LINK</a>
 */
public class TestOperationBasedOnComparison {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a, b;
    a = sc.nextInt();
    b = sc.nextInt();

    if (a > b)
      System.out.print(a * b);
    else
      System.out.print(b / a);
  }
}
