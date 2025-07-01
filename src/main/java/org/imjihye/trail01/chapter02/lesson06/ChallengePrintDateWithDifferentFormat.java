package org.imjihye.trail01.chapter02.lesson06;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-print-date-with-different-format/description">LINK</a>
 */
public class ChallengePrintDateWithDifferentFormat {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String str = sc.next();
    String[] strArr = str.split("\\.");

    System.out.printf("%s-%s-%s", strArr[1], strArr[2], strArr[0]);
  }
}
