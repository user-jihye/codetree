package org.imjihye.trail01.chapter06.lesson09;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/intro-row-column/description">LINK</a>
 */
public class IntroRowColumn {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a, b;
    a = sc.nextInt();
    b = sc.nextInt();

    for (int y = 1; y <= a; y++) {
      for (int x = 1; x <= b; x++) {
        System.out.print((x * y) + " ");
      }
      System.out.println();
    }
  }
}
