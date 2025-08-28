package org.imjihye.trail01.chapter09.lesson01;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/intro-print-strings-length/description">LINK</a>
 */
public class IntroPrintStringsLength {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String str1 = sc.next();
    String str2 = sc.next();

    System.out.println(str1.length() + str2.length());
  }
}
