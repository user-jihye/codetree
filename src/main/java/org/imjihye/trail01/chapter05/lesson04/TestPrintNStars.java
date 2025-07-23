package org.imjihye.trail01.chapter05.lesson04;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/test-print-n-stars/description">LINK</a>
 */
public class TestPrintNStars {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n, i = 1;
    n = sc.nextInt();

    while (i <= n) {
      System.out.println("*");
      i++;
    }
  }
}
