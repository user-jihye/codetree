package org.imjihye.trail01.chapter04.lesson02;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/intro-verify-test-passed/description">LINK</a>
 */
public class IntroVerifyTestPassed {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int score = sc.nextInt();

    if (score >= 80) {
      System.out.print("pass");
    } else {
      System.out.print((80 - score) + " more score");
    }
  }
}
