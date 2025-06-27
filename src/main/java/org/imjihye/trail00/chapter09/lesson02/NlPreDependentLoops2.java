package org.imjihye.trail00.chapter09.lesson02;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/nl-pre-dependent-loops-2/description">LINK</a>
 */
public class NlPreDependentLoops2 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int i = 1; i <= n; i++) {
      for (int j = 0; j < i * 2 - 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
