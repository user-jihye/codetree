package org.imjihye.trail01.chapter05.lesson07;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/intro-print-text/description">LINK</a>
 */
public class IntroPrintText {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String str = sc.next();

    for (int i = 0; i < 8; i++) {
      System.out.print(str);
    }
  }
}
