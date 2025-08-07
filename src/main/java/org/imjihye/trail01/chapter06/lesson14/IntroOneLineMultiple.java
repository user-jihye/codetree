package org.imjihye.trail01.chapter06.lesson14;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/intro-one-line-multiple/description">LINK</a>
 */
public class IntroOneLineMultiple {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        System.out.println(i + " * " + j + " = " + i*j);
      }
    }
  }
}
