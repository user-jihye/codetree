package org.imjihye.trail01.chapter05.lesson13;

import java.util.*;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/intro-unfriendly-number/description">LINK</a>
 */
public class IntroUnfriendlyNumber {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int cnt = 0;

    for (int i = 1; i <= n; i++) {
      if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0) {
        continue;
      }

      cnt++;
    }
    System.out.println(cnt);
  }
}
