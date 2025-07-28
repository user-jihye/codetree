package org.imjihye.trail01.chapter05.lesson15;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/intro-print-until-zero-is-given/description">LINK</a>
 */
public class IntroPrintUntilZeroIsGiven {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (true) {
      int n = sc.nextInt();

      if (n == 0) {
        break;
      }

      System.out.println(n);
    }
  }
}
