package org.imjihye.trail01.chapter04.lesson08;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/test-4-time-comparison/description">LINK</a>
 */
public class Test4TimeComparison {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int a, b, c, d, e;
    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();
    d = sc.nextInt();
    e = sc.nextInt();

    System.out.println(a > b ?  1 : 0);
    System.out.println(a > c ?  1 : 0);
    System.out.println(a > d ?  1 : 0);
    System.out.println(a > e ?  1 : 0);

  }
}
