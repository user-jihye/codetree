package org.imjihye.trail01.chapter06.lesson10;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/test-9-1-square/description">LINK</a>
 */
public class Test91Square {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int cnt  = 9;

    for (int y = 0; y < n; y++) {
      for (int x = 0; x < n; x++) {
        System.out.print(cnt);
        cnt--;
        if (cnt == 0)
          cnt = 9;
      }
      System.out.println();
    }
  }
}
