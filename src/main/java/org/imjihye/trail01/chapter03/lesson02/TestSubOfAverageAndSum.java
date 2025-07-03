package org.imjihye.trail01.chapter03.lesson02;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/test-sub-of-average-and-sum/description">LINK</a>
 */
public class TestSubOfAverageAndSum {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int a, b, c;
    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();

    int sum = a + b + c;
    int avg = sum / 3;

    System.out.println(sum);
    System.out.println(avg);
    System.out.println(sum - avg);
  }
}
