package org.imjihye.trail01.chapter05.lesson13;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/test-number-that-meets-the-condition/description">LINK</a>
 */
public class TestNumberThatMeetsTheCondition {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();

    for (int i = 1; i <= a; i++) {
      if (i % 2 == 0 && i % 4 != 0)
        continue;

      if ((i / 8) % 2 == 0)
        continue;

      if ((i%7) < 4)
        continue;

      System.out.print(i + " ");
    }
  }
}
