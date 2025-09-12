package org.imjihye.trail01.chapter09.lesson06;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/intro-find-specific-location-in-spring/description">LINK</a>
 */
public class IntroFindSpecificLocationInSpring {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    char chr = sc.next().charAt(0);

    if (str.indexOf(chr) == -1)
      System.out.println("No" +
              "");
    else
      System.out.println(str.indexOf(chr));
  }
}
