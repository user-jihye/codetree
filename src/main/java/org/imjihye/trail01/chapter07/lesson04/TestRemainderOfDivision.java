package org.imjihye.trail01.chapter07.lesson04;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/test-remainder-of-division/description">LINK</a>
 */
public class TestRemainderOfDivision {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int[] remArr = new int[b];

    while (a > 1) {
      remArr[a % b]++;
      a /= b;
    }

    int total = 0;
    for (int i = 0; i < b; i++) {
      total += remArr[i] * remArr[i];
    }

    System.out.println(total);

  }
}
