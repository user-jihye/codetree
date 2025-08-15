package org.imjihye.trail01.chapter07.lesson04;

import java.util.*;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/intro-count-one-to-nine/description">LINK</a>
 */
public class IntroCountOneToNine {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int[] cntArr = new int[10];

    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
      int x = sc.nextInt();
      cntArr[x]++;
    }

    for (int i = 1; i < 10; i++) {
      System.out.println(cntArr[i]);
    }
  }
}
