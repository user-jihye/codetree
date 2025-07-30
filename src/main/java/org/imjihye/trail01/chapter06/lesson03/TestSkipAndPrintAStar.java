package org.imjihye.trail01.chapter06.lesson03;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/test-skip-and-print-a-star/description">LINK</a>
 */
public class TestSkipAndPrintAStar {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int cnt = 1;
    for (int i = 0; i < n*2; i++) {

      for (int j = 0; j < cnt; j++) {
        System.out.print("*");
      }

      System.out.println();

      if (i < n-1)
        cnt++;
      else
        cnt--;
    }
  }
}
