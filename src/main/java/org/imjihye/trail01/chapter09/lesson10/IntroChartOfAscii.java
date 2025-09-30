package org.imjihye.trail01.chapter09.lesson10;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/intro-chart-of-ASCII/description">LINK</a>
 */
public class IntroChartOfAscii {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < 5; i++) {
      int x = sc.nextInt();
      System.out.print((char) x + " ");
    }
  }
}
