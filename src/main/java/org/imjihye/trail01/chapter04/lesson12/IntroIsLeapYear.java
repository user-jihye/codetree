package org.imjihye.trail01.chapter04.lesson12;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/intro-is-leap-year/description">LINK</a>
 */
public class IntroIsLeapYear {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int y = sc.nextInt();

    if (y % 4 != 0 || (y % 100 == 0 && y % 400 != 0)) {
      System.out.println("false");
    } else {
      System.out.println("true");
    }
  }
}
