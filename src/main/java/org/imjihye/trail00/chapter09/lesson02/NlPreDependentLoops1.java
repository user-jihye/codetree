package org.imjihye.trail00.chapter09.lesson02;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/nl-pre-dependent-loops-1/description">LINK</a>
 */
public class NlPreDependentLoops1 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int i = n; i > 0; i--) {
      for (int j = i; j > 0; j--) {
        System.out.print("* ");
      }
      System.out.println();
    }

  }
}
