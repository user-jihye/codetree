package org.imjihye.trail01.chapter06.lesson12;

import java.util.*;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/intro-normal-multiple/description">LINK</a>
 */
public class IntroNormalMultiple {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        System.out.printf("%d * %d = %d", i, j, i*j);
        if (j < n)
          System.out.print(", ");
      }
      System.out.println();
    }
  }
}
