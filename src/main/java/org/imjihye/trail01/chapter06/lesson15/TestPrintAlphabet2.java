package org.imjihye.trail01.chapter06.lesson15;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/test-print-alphabet-2/description">LINK</a>
 */
public class TestPrintAlphabet2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    char cnt = 'A';

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (j < i) {
          System.out.print("  ");
        }
        else {
          System.out.print(cnt + " ");
          cnt++;
          if (cnt > 'Z')
            cnt = 'A';
        }
      }
      System.out.println();
    }
  }
}
