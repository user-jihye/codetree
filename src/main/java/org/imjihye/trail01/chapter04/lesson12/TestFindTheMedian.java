package org.imjihye.trail01.chapter04.lesson12;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/test-find-the-median/description">LINK</a>
 */
public class TestFindTheMedian {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int a, b, c;
    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();

    if (a < b) {
      if (c < a) {
        System.out.println(a);
      } else if (b < c) {
        System.out.println(b);
      } else {
        System.out.println(c);
      }
    } else {
      if (a < c) {
        System.out.println(a);
      } else if (c < b) {
        System.out.println(b);
      } else {
        System.out.println(c);
      }
    }
  }
}
