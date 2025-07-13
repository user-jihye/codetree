package org.imjihye.trail01.chapter04.lesson05;

import java.util.*;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-evaluation-by-alphabet/description">LINK</a>
 */
public class ChallengeEvaluationByAlphabet {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String x = sc.next();

    if (x.equals("S")) {
      System.out.print("Superior");
    } else if (x.equals("A")) {
      System.out.print("Excellent");
    } else if (x.equals("B")) {
      System.out.print("Good");
    } else if (x.equals("C")) {
      System.out.print("Usually");
    } else if (x.equals("D")) {
      System.out.print("Effort");
    } else {
      System.out.print("Failure");
    }
  }
}
