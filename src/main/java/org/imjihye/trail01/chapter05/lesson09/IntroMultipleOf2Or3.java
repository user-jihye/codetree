package org.imjihye.trail01.chapter05.lesson09;

import java.util.*;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/intro-multiple-of-2-or-3/description">LINK</a>
 */
public class IntroMultipleOf2Or3 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    
    for (int i = 1; i <= N; i++) {
      if (i % 2 == 0 || i % 3 == 0) {
        System.out.print(1 + " ");
      } else {
        System.out.print(0 + " ");
      }
    }
  }
}
