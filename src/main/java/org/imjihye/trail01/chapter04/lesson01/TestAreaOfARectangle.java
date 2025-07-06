package org.imjihye.trail01.chapter04.lesson01;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/test-area-of-a-rectangle/description">LINK</a>
 */
public class TestAreaOfARectangle {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    System.out.println(n * n);

    if (n < 5)
      System.out.println("tiny");
  }
}
