package org.imjihye.trail01.chapter06.lesson13;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-output-numbers-according-to-specific-rule/description">LINK</a>
 */
public class ChallengeOutputNumbersAccordingToSpecificRule {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n, cnt = 1;
    n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (j < i) {
          System.out.print("  ");
        } else {
          System.out.print(cnt + " ");
          cnt++;
          if (cnt > 9) {
            cnt = 1;
          }
        }
      }
      System.out.println();
    }
  }
}
