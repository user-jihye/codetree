package org.imjihye.trail01.chapter06.lesson11;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/test-output-defferently-each-row/description">LINK</a>
 */
public class TestOutputDefferentlyEachRow {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int cnt = 0;

    for (int y = 1; y <= n; y++) {
      for (int x = 1; x <= n; x++) {
        if (y % 2 == 1) {
          cnt += 1;
        } else {
          cnt += 2;
        }
        System.out.print(cnt + " ");
      }
      System.out.println();
    }
  }
}
