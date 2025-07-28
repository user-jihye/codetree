package org.imjihye.trail01.chapter05.lesson15;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-print-share/description">LINK</a>
 */
public class ChallengePrintShare {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int cnt = 0;

    while (cnt < 3) {
      int x = sc.nextInt();

      if (x % 2 == 0) {
        System.out.println(x / 2);
        cnt++;
      }
    }
  }
}
