package org.imjihye.trail01.chapter06.lesson15;

import java.util.*;
/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/intro-print-alpabet-in-square/description">LINK</a>
 */
public class IntroPrintAlpabetInSquare {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int num = 'A';

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print((char) num);
        num++;
      }
      System.out.println();
    }
  }
}
