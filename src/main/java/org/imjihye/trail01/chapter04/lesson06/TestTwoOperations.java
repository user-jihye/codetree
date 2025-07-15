package org.imjihye.trail01.chapter04.lesson06;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/test-two-operations/description">LINK</a>
 */
public class TestTwoOperations {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();

    if (a % 2 == 1) {
      a += 3;
    }

    if (a % 3 == 0) {
      a /= 3;
    }

    System.out.println(a);
  }
}
