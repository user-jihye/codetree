package org.imjihye.trail01.chapter05.lesson14;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/test-divide-by-1/description">LINK</a>
 */
public class TestDivideBy1 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n, div, i = 1, cnt = 0;
    n = sc.nextInt();

    while (true) {
      n /= i;
      cnt++;

      if (n <= 1) {
        break;
      }
      
      i++;
    }
    System.out.println(cnt);
  }
}
