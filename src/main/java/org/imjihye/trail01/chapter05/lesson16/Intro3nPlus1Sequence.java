package org.imjihye.trail01.chapter05.lesson16;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/intro-3n-plus-1-sequence/description">LINK</a>
 */
public class Intro3nPlus1Sequence {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n, cnt = 0;
    n = sc.nextInt();

    while (n != 1) {
      if (n % 2 == 0)
        n /= 2;
      else
        n = n * 3 + 1;

      cnt++;
    }
    System.out.println(cnt);
  }
}
