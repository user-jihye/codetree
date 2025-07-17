package org.imjihye.trail01.chapter04.lesson07;

import java.util.*;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/intro-parity-of-two-numbers/description">LINK</a>
 */
public class IntroParityOfTwoNumbers {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();

    if (a % 2 == 0) {
      System.out.println("even");
    } else {
      System.out.println("odd");
    }

    if (b % 2 == 0) {
      System.out.println("even");
    } else {
      System.out.println("odd");
    }
  }
}
