package org.imjihye.trail01.chapter09.lesson02;

import java.util.*;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/intro-print-string-in-range/description">LINK</a>
 */
public class IntroPrintStringInRange {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();

    for (int i = 2; i < 10; i++) {
      System.out.print(str.charAt(i));
    }
  }
}
