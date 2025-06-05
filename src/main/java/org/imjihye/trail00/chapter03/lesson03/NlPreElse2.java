package org.imjihye.trail00.chapter03.lesson03;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/nl-pre-else-2/description">LINK</a>
 */
public class NlPreElse2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();

    if (a > b) {
      System.out.println(a*b);
    } else {
      System.out.println(b/a);
    }
  }
}
