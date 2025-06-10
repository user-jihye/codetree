package org.imjihye.trail00.chapter04.lesson01;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/nl-pre-loop-basics-3/description">LINK</a>
 */
public class NlPreLoopBasics3 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      a += n;
      System.out.println(a);
    }
  }
}
