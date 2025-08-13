package org.imjihye.trail01.chapter07.lesson01;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/test-print-even-numbers-upside-down/description">LINK</a>
 */
public class TestPrintEvenNumbersUpsideDown {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    for (int i = n-1; i >= 0; i--) {
      if (arr[i] % 2 == 0)
        System.out.print(arr[i] + " ");
    }
  }
}
