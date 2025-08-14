package org.imjihye.trail01.chapter07.lesson03;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/intro-print-square-of-elements/description">LINK</a>
 */
public class IntroPrintSquareOfElements {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] * arr[i] + " ");
    }
  }
}
