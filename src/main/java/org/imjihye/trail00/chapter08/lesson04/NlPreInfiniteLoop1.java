package org.imjihye.trail00.chapter08.lesson04;

import java.util.*;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/nl-pre-infinite-loop-1/description">LINK</a>
 */
public class NlPreInfiniteLoop1 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    while(true) {
      int num = sc.nextInt();

      if (num == 0) {
        break;
      } else {
        System.out.println(num);
      }
    }

  }
}
