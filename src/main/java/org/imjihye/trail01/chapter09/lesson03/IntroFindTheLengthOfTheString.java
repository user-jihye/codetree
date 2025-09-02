package org.imjihye.trail01.chapter09.lesson03;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/intro-find-the-length-of-the-string/description">LINK</a>
 */
public class IntroFindTheLengthOfTheString {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String[] str = new String[10];

    for (int i = 0; i < 10; i++)
      str[i] = sc.next();

    int length = 0;
    for (int i = 0; i < 10; i++)
      length += str[i].length();

    System.out.println(length);
  }
}
