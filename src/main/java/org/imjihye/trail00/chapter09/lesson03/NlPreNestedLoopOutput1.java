package org.imjihye.trail00.chapter09.lesson03;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/nl-pre-nested-loop-output-1/description">LINK</a>
 */
public class NlPreNestedLoopOutput1 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        System.out.print(i + " * " + j + " = " + (i*j));
        if (j != n) {
          System.out.print(", ");
        }
      }
      System.out.println();
;    }

  }
}
