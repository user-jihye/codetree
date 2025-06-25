package org.imjihye.trail00.chapter08.lesson03;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/nl-pre-loop-variables-3/description">LINK</a>
 */
public class NlPreLoopVariables3 {

  public static void main(String[] args) {
    String[] fruits = {"apple", "banana", "grape", "blueberry", "orange"};

    Scanner sc = new Scanner(System.in);
    String chr = sc.next();

    int cnt = 0;

    for (int i = 0; i < 5; i++) {
      String fruit = fruits[i];

      if (fruit.charAt(2) == chr.charAt(0) || fruit.charAt(3) == chr.charAt(0)) {
        System.out.println(fruit);
        cnt += 1;
      }
    }

    System.out.println(cnt);

  }
}
