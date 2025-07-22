package org.imjihye.trail01.chapter04.lesson11;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-math-scores-are-more-difficult/description">LINK</a>
 */
public class ChallengeMathScoresAreMoreDifficult {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int aMath, aEng;
    int bMath, bEng;

    aMath = sc.nextInt();
    aEng = sc.nextInt();
    bMath = sc.nextInt();
    bEng = sc.nextInt();

    if (aMath > bMath) {
      System.out.println("A");
    } else if (aMath < bMath) {
      System.out.println("B");
    } else {
      if (aEng > bEng) {
        System.out.println("A");
      } else {
        System.out.println("B");
      }
    }
  }
}
