package org.imjihye.trail01.chapter09.lesson09;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-SPin-SPring/description">LINK</a>
 */
public class ChallengeSpinSpring {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    int len = str.length();

    System.out.println(str);

    for (int i = 0; i < len; i++) {
      str = str.substring(len - 1) + str.substring(0, len - 1);
      System.out.println(str);
    }
  }
}
