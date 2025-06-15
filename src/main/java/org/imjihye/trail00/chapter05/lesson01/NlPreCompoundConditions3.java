package org.imjihye.trail00.chapter05.lesson01;

import java.util.*;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/nl-pre-compound-conditions-3/description">LINK</a>
 */
public class NlPreCompoundConditions3 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    if (n % 2 == 1 && n % 3 == 0) {
      System.out.println("true");
    } else if (n % 2 == 0 && n % 5 == 0) {
      System.out.println("true");
    } else {
      System.out.println("false");
    }

  }
}
