package org.imjihye.trail01.chapter05.lesson16;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-pow-of-2/description">LINK</a>
 */
public class ChallengePowOf2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n, x = 0;
    n = sc.nextInt();

    while (n != 1) {
      x++;
      n /= 2;
    }

    System.out.println(x);
  }
}
