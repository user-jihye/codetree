package org.imjihye.trail00.chapter03.lesson03;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/nl-pre-else-3/description">LINK</a>
 */
public class NlPreElse3 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();

    if (a < b) {
      System.out.print(1 + " ");
    } else {
      System.out.print(0 + " ");
    }

    if (a == b) {
      System.out.print(1);
    } else {
      System.out.print(0);
    }
  }
}
