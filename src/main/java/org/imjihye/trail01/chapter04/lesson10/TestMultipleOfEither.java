package org.imjihye.trail01.chapter04.lesson10;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/test-multiple-of-either/description">LINK</a>
 */
public class TestMultipleOfEither {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();

    if (a % 3 == 0 || a % 5 == 0) {
      System.out.println(1);
    } else {
      System.out.println(0);
    }
  }
}
