package org.imjihye.trail01.chapter09.lesson04;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/intro-print-chars-from-word/description">LINK</a>
 */
public class IntroPrintCharsFromWord {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();

    for (int i = 0; i < str.length(); i++)
      System.out.println(str.charAt(i));
  }
}
