package org.imjihye.trail01.chapter05.lesson09;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-369-game/description">LINK</a>
 */
public class Challenge369Game {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int i = 1; i <= n; i++) {

      int remainder;
      int temp = i;
      boolean has369 = false;
      while (temp > 0) {
        remainder = temp % 10;
        if (remainder == 3 || remainder == 6 || remainder == 9) {
          has369 = true;
          break;
        }

        temp /= 10;
      }

      if (i % 3 == 0 || has369) {
        System.out.print(0 + " ");
      } else {
        System.out.print(i + " ");
      }
    }
  }
}
