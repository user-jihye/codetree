package org.imjihye.trail01.chapter04.lesson09;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-eye-test/description">LINK</a>
 */
public class ChallengeEyeTest {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double right, left;
    right = sc.nextDouble();
    left = sc.nextDouble();

    if (right >= 1.0 && left >= 1) {
      System.out.println("High");
    } else if (right >= 0.5 && left >= 0.5) {
      System.out.println("Middle");
    } else {
      System.out.println("Low");
    }
  }
}
