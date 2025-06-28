package org.imjihye.trail00.chapter10.lesson04;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/nl-pre-2d-array-pattern-printing-1/description">LINK</a>
 */
public class NlPre2dArrayPatternPrinting1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {

      int num = 1;
      int[] row = new int[n];
      if (i % 2 == 0) {
        for (int j = 0; j < n; j++) {
          row[j] = num++;
        }
      } else {
        for (int j = n-1; j >= 0; j--) {
          row[j] = num++;
        }
      }

      for (int j = 0; j < n; j++) {
        System.out.print(row[j]);
      }
      System.out.println();
    }
  }
}
