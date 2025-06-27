package org.imjihye.trail00.chapter08.lesson04;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/nl-pre-infinite-loop-2/description">LINK</a>
 */
public class NlPreInfiniteLoop2 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    while (a <= b) {
      System.out.print(a + " ");
      if (a % 2 == 1) {
        a *= 2;
      } else {
        a += 3;
      }
    }



  }
}
