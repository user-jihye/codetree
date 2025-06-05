package org.imjihye.trail00.chapter03.lesson02;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/nl-pre-if-2/description">LINK</a>
 */
public class NlPreIf2 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    if (a >= b) {
      System.out.println(1);
    } else {
      System.out.println(0);
    }

    if (a > b) {
      System.out.println(1);
    } else {
      System.out.println(0);
    }

    if (a <= b) {
      System.out.println(1);
    } else {
      System.out.println(0);
    }

    if (a < b) {
      System.out.println(1);
    } else {
      System.out.println(0);
    }

    if (a == b) {
      System.out.println(1);
    } else {
      System.out.println(0);
    }

    if (a != b) {
      System.out.println(1);
    } else {
      System.out.println(0);
    }
    
  }
}
