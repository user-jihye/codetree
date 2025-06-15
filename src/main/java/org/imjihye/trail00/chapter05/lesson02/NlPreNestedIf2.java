package org.imjihye.trail00.chapter05.lesson02;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/nl-pre-nested-if-2/description">LINK</a>
 */
public class NlPreNestedIf2 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int y = sc.nextInt();

    if (y % 4 == 0) {
      if (y % 100 == 0 && y % 400 != 0) {
        System.out.println("false");
      } else {
        System.out.println("true");
      }
    } else {
      System.out.println("false");
    }

  }
}
