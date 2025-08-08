package org.imjihye.trail01.chapter06.lesson15;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-print-alphabet/description">LINK</a>
 */
public class ChallengePrintAlphabet {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    char cnt = 'A';

    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print(cnt);
        cnt++;
        if (cnt > 'Z')
          cnt = 'A';
      }
      System.out.println();
    }
  }
}
