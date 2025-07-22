package org.imjihye.trail01.chapter04.lesson09;

import java.util.*;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/intro-score-comparison/description">LINK</a>
 */
public class IntroScoreComparison {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int aMath, aEnglish;
    int bMath, bEnglish;

    aMath = sc.nextInt();
    aEnglish = sc.nextInt();
    bMath = sc.nextInt();
    bEnglish = sc.nextInt();

    if (aMath > bMath && aEnglish > bEnglish) {
      System.out.println(1);
    } else {
      System.out.println(0);
    }
  }
}
