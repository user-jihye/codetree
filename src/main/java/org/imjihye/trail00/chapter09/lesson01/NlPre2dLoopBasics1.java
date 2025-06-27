package org.imjihye.trail00.chapter09.lesson01;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/nl-pre-2d-loop-basics-1/description">LINK</a>
 */
public class NlPre2dLoopBasics1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
