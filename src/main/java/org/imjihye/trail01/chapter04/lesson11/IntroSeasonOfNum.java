package org.imjihye.trail01.chapter04.lesson11;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/intro-season-of-num/description">LINK</a>
 */
public class IntroSeasonOfNum {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();

    if (m >= 3 && m <= 5) {
      System.out.println("Spring");
    } else if (m >= 6 && m <= 8) {
      System.out.println("Summer");
    } else if (m >= 9 && m <= 11) {
      System.out.println("Fall");
    } else {
      System.out.println("Winter");
    }
  }
}
