package org.imjihye.trail01.chapter05.lesson12;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/intro-multiplication-up-to-a-given-number/description">LINK</a>
 */
public class IntroMultiplicationUpToAGivenNumber {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a, b, prod = 1;
    a = sc.nextInt();
    b = sc.nextInt();

    for (int i = a; i <= b; i++) {
      prod *= i;
    }

    System.out.println(prod);
  }
}
