package org.imjihye.trail01.chapter02.lesson06;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/test-change-phone-number/description">LINK</a>
 */
public class TestChangePhoneNumber {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String str = sc.next();
    String[] strArr = str.split("-");

    System.out.print(strArr[0] + "-" + strArr[2] + "-" + strArr[1]);
  }
}
