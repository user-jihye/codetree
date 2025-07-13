package org.imjihye.trail01.chapter04.lesson05;

import java.util.*;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/test-things-able-to-buy-2/description">LINK</a>
 */
public class TestThingsAbleToBuy2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int money = sc.nextInt();

    if (money >= 3000) {
      System.out.print("book");
    } else if (money >= 1000) {
      System.out.print("mask");
    } else if (money >= 500) {
      System.out.print("pen");
    } else {
      System.out.print("no");
    }
  }
}
