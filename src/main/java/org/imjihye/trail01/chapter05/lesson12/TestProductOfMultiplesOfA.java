package org.imjihye.trail01.chapter05.lesson12;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/test-product-of-multiples-of-a/description">LINK</a>
 */
public class TestProductOfMultiplesOfA {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a, b, prod = 1;
    a = sc.nextInt();
    b = sc.nextInt();

    for (int i = 1; i <= b; i++) {
      if (i % a == 0) {
        prod *= i;
      }
    }

    System.out.println(prod);
  }
}
