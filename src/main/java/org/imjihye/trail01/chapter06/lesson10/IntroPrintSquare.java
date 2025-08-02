package org.imjihye.trail01.chapter06.lesson10;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/intro-print-square/description">LINK</a>
 */
public class IntroPrintSquare {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int cnt = 1;

    for (int y = 0; y < n; y++) {
      for (int x = 0; x < n; x++) {
        System.out.print(cnt + " ");
        cnt++;
      }
      System.out.println();
    }
  }
}
