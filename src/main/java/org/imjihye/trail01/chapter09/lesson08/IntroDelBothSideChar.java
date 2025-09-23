package org.imjihye.trail01.chapter09.lesson08;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/intro-del-both-side-char/description">LINK</a>
 */
public class IntroDelBothSideChar {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String str = sc.next();

    str = str.substring(0, 1) + str.substring(2, str.length() - 2) + str.substring(str.length() - 1);

    System.out.print(str);
  }
}
