package org.imjihye.trail01.chapter04.lesson04;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-eye-test-2/description">LINK</a>
 */
public class ChallengeEyeTest2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double eye = sc.nextDouble();

    if (eye >= 1.0)
      System.out.print("High");
    else if (eye >= 0.5)
      System.out.print("Middle");
    else
      System.out.print("Low");
  }
}
