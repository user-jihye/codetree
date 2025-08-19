package org.imjihye.trail01.chapter07.lesson05;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/intro-count-numbers/description">LINK</a>
 */
public class IntroCountNumbers {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n, m;
    n = sc.nextInt();
    m = sc.nextInt();

    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    int cnt = 0;
    for (int i = 0; i < n; i++) {
      if (arr[i] == m)
        cnt++;
    }

    System.out.println(cnt);
  }
}
