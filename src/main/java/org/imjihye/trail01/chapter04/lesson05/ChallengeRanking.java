package org.imjihye.trail01.chapter04.lesson05;

import java.util.*;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-ranking/description">LINK</a>
 */
public class ChallengeRanking {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int score = sc.nextInt();

    if (score >= 90) {
      System.out.print("A");
    } else if (score >= 80) {
      System.out.print("B");
    } else if (score >= 70) {
      System.out.print("C");
    } else if (score >= 60) {
      System.out.print("D");
    } else {
      System.out.print("F");
    }

  }
}
