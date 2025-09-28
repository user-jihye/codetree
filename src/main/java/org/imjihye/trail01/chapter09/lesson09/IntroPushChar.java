package org.imjihye.trail01.chapter09.lesson09;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/intro-push-char/description">LINK</a>
 */
public class IntroPushChar {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String str = sc.next();

    System.out.println(str.substring(1) + str.substring(0, 1));
  }
}
