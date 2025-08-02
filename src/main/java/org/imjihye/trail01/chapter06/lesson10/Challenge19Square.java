package org.imjihye.trail01.chapter06.lesson10;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-1-9-square/description">LINK</a>
 */
public class Challenge19Square {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int cnt = 1;

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print(cnt);
        cnt++;
        if (cnt > 9)
          cnt = 1;
      }
      System.out.println();
    }
  }
}
