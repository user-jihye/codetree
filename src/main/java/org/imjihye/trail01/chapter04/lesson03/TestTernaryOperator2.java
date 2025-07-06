package org.imjihye.trail01.chapter04.lesson03;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/test-ternary-operator-2/description">LINK</a>
 */
public class TestTernaryOperator2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();

    System.out.print(a == 1 ? 't' : 'f');
  }
}
