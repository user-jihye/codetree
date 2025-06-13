package org.imjihye.trail00.chapter05.lesson01;

import java.util.*;
/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/nl-pre-compound-conditions-1/description">LINK</a>
 */
public class NlPreCompoundConditions1 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int a_math = sc.nextInt();
    int a_english = sc.nextInt();

    int b_math = sc.nextInt();
    int b_english = sc.nextInt();

    if (a_math > b_math && a_english > b_english) {
      System.out.println(1);
    } else {
      System.out.println(0);
    }
  }
}
