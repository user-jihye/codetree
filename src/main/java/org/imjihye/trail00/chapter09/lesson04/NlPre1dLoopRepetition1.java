package org.imjihye.trail00.chapter09.lesson04;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/nl-pre-1d-loop-repetition-1/description">LINK</a>
 */
public class NlPre1dLoopRepetition1 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();

      int total = 0;

      for (int j = a; j <= b; j++) {
        if (j % 2 == 0) {
          total += j;
        }
      }

      System.out.println(total);
      
    }

  }
}
