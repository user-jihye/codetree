package org.imjihye.trail01.chapter09.lesson01;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-longer-string/description">LINK</a>
 */
public class ChallengeLongerString {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String str1 = sc.next();
    String str2 = sc.next();

    if (str1.length() > str2.length())
      System.out.println(str1 + " " + str1.length());
    else if (str1.length() < str2.length())
      System.out.println(str2 + " " + str2.length());
    else
      System.out.println("same");

  }
}
