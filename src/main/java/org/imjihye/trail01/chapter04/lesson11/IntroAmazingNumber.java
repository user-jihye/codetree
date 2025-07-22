package org.imjihye.trail01.chapter04.lesson11;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/intro-amazing-number/description">LINK</a>
 */
public class IntroAmazingNumber {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    if ((n % 2 == 1 && n % 3 == 0) || (n % 2 == 0 && n % 5 == 0)) {
      System.out.println("true");
    } else {
      System.out.println("false");
    }
  }
}
