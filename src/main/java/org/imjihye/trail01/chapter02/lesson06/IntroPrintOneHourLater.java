package org.imjihye.trail01.chapter02.lesson06;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/intro-print-one-hour-later/description">LINK</a>
 */
public class IntroPrintOneHourLater {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String[] strArr = s.split(":");
    int hour = Integer.parseInt(strArr[0]) + 1;
    String minute = strArr[1];
    System.out.printf("%d:%s", hour, minute);
  }
}
