package org.imjihye.trail00.chapter08.lesson03;

import java.util.*;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/nl-pre-loop-variables-1/description">LINK</a>
 */
public class NlPreLoopVariables1 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int total = 0;

    for (int i = a; i <= b; i++) {
      if (i % 2 == 1) {
        continue;
      }
      total += i;
    }

    System.out.println(total);
  }
}
