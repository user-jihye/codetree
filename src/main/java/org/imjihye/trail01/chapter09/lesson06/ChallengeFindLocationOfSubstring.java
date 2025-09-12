package org.imjihye.trail01.chapter09.lesson06;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-find-location-of-substring/description">LINK</a>
 */
public class ChallengeFindLocationOfSubstring {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String str1 = sc.next();
    String str2 = sc.next();

    System.out.println(str1.indexOf(str2));
  }
}
