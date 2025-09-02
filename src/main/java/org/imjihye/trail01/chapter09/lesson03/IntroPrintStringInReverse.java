package org.imjihye.trail01.chapter09.lesson03;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/intro-print-string-in-reverse/description">LINK</a>
 */
public class IntroPrintStringInReverse {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String[] str = new String[4];

    for (int i = 0; i < 4; i++)
      str[i] = sc.next();


    for (int i = 3; i >= 0; i--)
      System.out.println(str[i]);
  }
}
