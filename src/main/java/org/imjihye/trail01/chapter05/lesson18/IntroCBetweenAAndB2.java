package org.imjihye.trail01.chapter05.lesson18;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/intro-c-between-a-and-b-2/description">LINK</a>
 */
public class IntroCBetweenAAndB2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a, b, c;
    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();

    boolean satisfied = true;

    for (int i = a; i <= b; i++) {
      if (i % c == 0) {
        satisfied = false;
      }
    }

    if (satisfied) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}
