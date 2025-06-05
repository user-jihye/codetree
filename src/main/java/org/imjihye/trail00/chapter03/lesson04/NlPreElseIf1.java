package org.imjihye.trail00.chapter03.lesson04;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/nl-pre-else-if-1/description">LINK</a>
 */
public class NlPreElseIf1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    if (n < 0) {
      System.out.println("ice");
    } else if (n >= 100) {
      System.out.println("vapor");
    } else {
      System.out.println("water");
    }
  }
}
