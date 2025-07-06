package org.imjihye.trail01.chapter04.lesson03;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/intro-max-of-two-nums/description">LINK</a>
 */
public class IntroMaxOfTwoNums {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a, b;
    a = sc.nextInt();
    b = sc.nextInt();

    System.out.print(a > b ? a : b);
  }
}
