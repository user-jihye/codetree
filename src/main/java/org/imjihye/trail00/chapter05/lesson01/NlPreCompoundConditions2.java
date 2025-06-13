package org.imjihye.trail00.chapter05.lesson01;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/nl-pre-compound-conditions-2/description">LINK</a>
 */
public class NlPreCompoundConditions2 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();

    if (a % 13 == 0 || a % 19 == 0) {
      System.out.println("True");
    } else {
      System.out.println("False");
    }
  }
}
