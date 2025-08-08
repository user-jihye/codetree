package org.imjihye.trail01.chapter06.lesson16;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-3n-plus-1-sequence-m-times/description">LINK</a>
 */
public class Challenge3nPlus1SequenceMTimes {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();

    for (int i = 0; i < m; i++) {
      int n, cnt = 0;
      n = sc.nextInt();

      while (n != 1) {
        if (n % 2 == 0)
          n = n / 2;
        else
          n = n * 3 + 1;
        cnt++;
      }
      System.out.println(cnt);
    }
  }
}
