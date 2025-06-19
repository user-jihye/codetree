package org.imjihye.trail00.chapter08.lesson01;

import java.util.*;
/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/nl-pre-conditional-loops-1/description">LINK</a>
 */
public class NlPreConditionalLoops1 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    for (int i = num; i <= 100; i++) {
      if (i >= 90) {
        System.out.print("A ");
      } else if (i >= 80) {
        System.out.print("B ");
      } else if (i >= 70) {
        System.out.print("C ");
      } else if (i >= 60) {
        System.out.print("D ");
      } else {
        System.out.print("F ");
      }
    }
  }
}
