package org.imjihye.trail01.chapter04.lesson01;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-bmi/description">LINK</a>
 */
public class ChallengeBmi {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();

    int b = (10000 * w) / (h * h);
    System.out.println(b);

    if (b >= 25)
      System.out.println("Obesity");
  }
}
