package org.imjihye.trail01.chapter06.lesson13;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/test-output-that-matches-the-rule/description">LINK</a>
 */
public class TestOutputThatMatchesTheRule {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      for (int j = n-i; j <= n; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }
}
