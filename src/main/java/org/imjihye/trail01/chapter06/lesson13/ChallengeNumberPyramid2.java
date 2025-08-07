package org.imjihye.trail01.chapter06.lesson13;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-number-pyramid-2/description">LINK</a>
 */
public class ChallengeNumberPyramid2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n, cnt = 1;
    n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print(cnt + " ");
        cnt++;
      }
      System.out.println();
    }
  }
}
