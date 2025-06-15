package org.imjihye.trail00.chapter05.lesson02;

import java.util.*;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/nl-pre-nested-if-3/description">LINK</a>
 */
public class NlPreNestedIf3 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    int median;

    if (a > b) {
      if (b > c) {
        median = b;
      } else {
        if (a > c) {
          median = c;
        } else {
          median = a;
        }
      }
    } else {
      if (a > c) {
        median = a;
      } else {
        if (c > b) {
          median = b;
        } else {
          median = c;
        }
      }
    }

    System.out.println(median);

  }
}
