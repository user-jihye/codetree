package org.imjihye.trail01.chapter06.lesson16;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/intro-a-multiple-b-n-times/description">LINK</a>
 */
public class IntroAMultipleBNTimes {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      int a, b, multi = 1;
      a = sc.nextInt();
      b = sc.nextInt();

      for (int j = a; j <= b; j++) {
        multi *= j;
      }
      System.out.println(multi);
    }
  }
}
