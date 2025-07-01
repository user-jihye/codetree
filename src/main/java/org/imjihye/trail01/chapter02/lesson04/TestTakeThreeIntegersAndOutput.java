package org.imjihye.trail01.chapter02.lesson04;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/test-take-three-integers-and-output/description">LINK</a>
 */
public class TestTakeThreeIntegersAndOutput {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    System.out.printf("%d %d %d", a, b, c);
  }
}
