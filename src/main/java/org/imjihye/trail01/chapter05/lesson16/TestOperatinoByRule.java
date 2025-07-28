package org.imjihye.trail01.chapter05.lesson16;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/test-operatino-by-rule/description">LINK</a>
 */
public class TestOperatinoByRule {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n, cnt = 0;
    n = sc.nextInt();

    while (true) {

      if (n % 2 == 0)
        n = n * 3 + 1;
      else
        n = n * 2 + 2;

      cnt++;

      if (n >= 1000)
        break;
    }

    System.out.println(cnt);
  }
}
