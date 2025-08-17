package org.imjihye.trail01.chapter07.lesson04;

import java.util.*;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-find-out-the-score-range/description">LINK</a>
 */
public class ChallengeFindOutTheScoreRange {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int[] arr = new int[11];

    for (int i = 0; i < 100; i++) {
      int score = sc.nextInt();

      if (score == 0)
        break;

      arr[score / 10]++;
    }

    for (int i = 10; i >= 1; i--) {
      System.out.println(i * 10 + " - " + arr[i]);
    }
  }
}
