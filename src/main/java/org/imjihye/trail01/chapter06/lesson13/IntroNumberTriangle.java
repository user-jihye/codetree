package org.imjihye.trail01.chapter06.lesson13;

import java.util.*;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/intro-number-triangle/description">LINK</a>
 */
public class IntroNumberTriangle {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < i+1; j++) {
        System.out.print(j + 1 + " ");
      }
      System.out.println();
    }
  }
}
