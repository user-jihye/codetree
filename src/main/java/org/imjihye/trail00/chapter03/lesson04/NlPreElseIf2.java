package org.imjihye.trail00.chapter03.lesson04;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/nl-pre-else-if-2/description">LINK</a>
 */
public class NlPreElseIf2 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int money = sc.nextInt();

    if (money >= 3000) {
      System.out.println("book");
    } else if (money >= 1000) {
      System.out.println("mask");
    } else {
      System.out.println("no");
    }

  }
}
