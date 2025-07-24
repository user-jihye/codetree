package org.imjihye.trail01.chapter05.lesson10;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/test-check-number-of-appearances/description">LINK</a>
 */
public class TestCheckNumberOfAppearances {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int cnt = 0;

    for (int i = 0; i < 5; i++) {
      int num = sc.nextInt();
      if (num % 2 == 0) {
        cnt++;
      }
    }

    System.out.println(cnt);
  }
}
