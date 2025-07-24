package org.imjihye.trail01.chapter05.lesson10;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/intro-number-of-multipliers-2/description">LINK</a>
 */
public class IntroNumberOfMultipliers2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int cnt = 0;

    for (int i = 0; i < 10; i++) {
      int num = sc.nextInt();
      if (num % 2 == 1) {
        cnt++;
      }
    }

    System.out.println(cnt);
  }
}
