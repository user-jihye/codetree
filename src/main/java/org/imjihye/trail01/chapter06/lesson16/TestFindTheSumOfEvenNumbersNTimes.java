package org.imjihye.trail01.chapter06.lesson16;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/test-find-the-sum-of-even-numbers-n-times/description">LINK</a>
 */
public class TestFindTheSumOfEvenNumbersNTimes {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      int a, b, sum = 0;
      a = sc.nextInt();
      b = sc.nextInt();

      for (int j = a; j <= b; j++) {
        if (j % 2 == 0)
          sum += j;
      }
      
      System.out.println(sum);
    }
  }
}
