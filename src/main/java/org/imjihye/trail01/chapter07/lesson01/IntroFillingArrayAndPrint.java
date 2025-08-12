package org.imjihye.trail01.chapter07.lesson01;

import java.util.*;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/intro-filling-array-and-print/description">LINK</a>
 */
public class IntroFillingArrayAndPrint {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char[] arr = new char[10];

    for (int i = 0; i < 10; i++) {
      arr[i] = sc.next().charAt(0);
    }

    for (int i = 9; i >= 0; i--) {
      System.out.print(arr[i]);
    }
  }
}
