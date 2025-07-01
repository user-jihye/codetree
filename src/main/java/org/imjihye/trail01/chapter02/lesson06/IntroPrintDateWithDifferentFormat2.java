package org.imjihye.trail01.chapter02.lesson06;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/intro-print-date-with-different-format-2/description">LINK</a>
 */
public class IntroPrintDateWithDifferentFormat2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] strArr = sc.next().split("-");

    System.out.printf("%s.%s.%s", strArr[2], strArr[0], strArr[1]);
  }
}
