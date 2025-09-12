package org.imjihye.trail01.chapter09.lesson06;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/intro-specific-character-presence/description">LINK</a>
 */
public class IntroSpecificCharacterPresence {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String str = sc.next();

    if (str.contains("ee"))
      System.out.print("Yes ");
    else
      System.out.print("No ");

    if (str.contains("ab"))
      System.out.print("Yes");
    else
      System.out.print("No");
  }
}
