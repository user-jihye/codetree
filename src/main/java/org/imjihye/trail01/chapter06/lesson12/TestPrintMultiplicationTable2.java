package org.imjihye.trail01.chapter06.lesson12;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/test-print-multiplication-table-2/description">LINK</a>
 */
public class TestPrintMultiplicationTable2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a, b;
    a = sc.nextInt();
    b = sc.nextInt();

    for (int i = 2; i <= 8; i += 2) {
      for (int j = b; j >= a; j--) {
        System.out.printf("%d * %d = %d", j, i, i*j);
        if (j > a)
          System.out.print(" / ");
      }
      System.out.println();
    }
  }
}
