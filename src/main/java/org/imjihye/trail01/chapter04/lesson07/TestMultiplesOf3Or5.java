package org.imjihye.trail01.chapter04.lesson07;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/test-multiples-of-3-or-5/description">LINK</a>
 */
public class TestMultiplesOf3Or5 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();

    if (a % 3 == 0) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }

    if (a % 5 == 0) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}
