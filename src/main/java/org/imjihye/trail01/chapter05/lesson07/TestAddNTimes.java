package org.imjihye.trail01.chapter05.lesson07;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/test-add-n-times/description">LINK</a>
 */
public class TestAddNTimes {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int a, n;
    a = sc.nextInt();
    n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      a += n;
      System.out.println(a);
    }
  }
}
