package org.imjihye.trail01.chapter07.lesson05;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/test-where-2-appears-3rd/description">LINK</a>
 */
public class TestWhere2Appears3rd {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    int cnt = 0;
    for (int i = 0; i < n; i++) {
      if (arr[i] == 2)
        cnt++;

      if (cnt == 3) {
        System.out.println(i + 1);
        break;
      }
    }
  }
}
