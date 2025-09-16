package org.imjihye.trail01.chapter09.lesson07;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-changing-char/description">LINK</a>
 */
public class ChallengeChangingChar {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String str1 = sc.next();
    String str2 = sc.next();

    String newStr = str1.substring(0, 2) + str2.substring(2, str2.length());
    System.out.println(newStr);
  }
}
