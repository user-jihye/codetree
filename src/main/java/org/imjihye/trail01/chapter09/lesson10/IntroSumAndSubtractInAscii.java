package org.imjihye.trail01.chapter09.lesson10;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/intro-sum-and-subtract-in-ASCII/description">LINK</a>
 */
public class IntroSumAndSubtractInAscii {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char x = sc.next().charAt(0);
    char y = sc.next().charAt(0);

    int num1 = (int) x;
    int num2 = (int) y;

    System.out.print(num1 + num2 + " ");

    if (num1 > num2)
      System.out.print(num1 - num2);
    else
      System.out.print(num2 - num1);
  }
}
