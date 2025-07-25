package org.imjihye.trail01.chapter05.lesson11;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/test-find-the-total/description">LINK</a>
 */
public class TestFindTheTotal {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int a, b, sum = 0;
    a = sc.nextInt();
    b = sc.nextInt();

    for (int i = a; i <= b; i++) {
      if (i % 6 == 0 && i % 8 != 0) {
        sum += i;
      }
    }
    System.out.println(sum);

  }
}
