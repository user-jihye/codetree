package org.imjihye.trail00.chapter06.lesson02;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/nl-pre-1d-array-iteration-1/description">LINK</a>
 */
public class NlPre1dArrayIteration1 {

  public static void main(String[] args) {

    String[] str = new String[10];

    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < 10; i++) {
      str[i] = sc.next();
    }

    for (int i = 9; i >= 0; i--) {
      System.out.print(str[i]);
    }

  }
}
