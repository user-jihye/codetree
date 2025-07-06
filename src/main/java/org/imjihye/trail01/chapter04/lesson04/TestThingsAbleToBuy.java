package org.imjihye.trail01.chapter04.lesson04;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/test-things-able-to-buy/description">LINK</a>
 */
public class TestThingsAbleToBuy {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int money = sc.nextInt();

    if (money >= 3000)
      System.out.print("book");
    else if (money >= 1000)
      System.out.print("mask");
    else
      System.out.print("no");
  }
}
