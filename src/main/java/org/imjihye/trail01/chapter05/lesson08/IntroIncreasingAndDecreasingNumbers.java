package org.imjihye.trail01.chapter05.lesson08;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/intro-increasing-and-decreasing-numbers/description">LINK</a>
 */
public class IntroIncreasingAndDecreasingNumbers {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char c = sc.next().charAt(0);
    int n = sc.nextInt();

    if (c == 'A') {
      for (int i = 1; i <= n; i++) {
        System.out.print(i + " ");
      }
    } else if (c == 'D') {
      for (int i = n; i >= 1; i--) {
        System.out.print(i + " ");
      }
    }
  }
}
