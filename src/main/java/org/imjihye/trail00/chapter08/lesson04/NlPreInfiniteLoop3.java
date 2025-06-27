package org.imjihye.trail00.chapter08.lesson04;

import java.util.*;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/nl-pre-infinite-loop-3/description">LINK</a>
 */
public class NlPreInfiniteLoop3 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    while (true) {

      int num = sc.nextInt();

      if (num == 25) {
        System.out.println("Good");
        break;
      } else if (num < 25) {
        System.out.println("Higher");
      } else {
        System.out.println("Lower");
      }
      
    }
  }
}
