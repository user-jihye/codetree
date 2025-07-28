package org.imjihye.trail01.chapter05.lesson17;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/test-presence-or-absence-of-a-common-divisor/description">LINK</a>
 */
public class TestPresenceOrAbsenceOfACommonDivisor {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a, b;
    a = sc.nextInt();
    b = sc.nextInt();

    boolean satisfied = false;

    for (int i = a; i <= b; i++) {
      if (1920 % i == 0 && 2880 % i == 0)
        satisfied = true;
    }

    if (satisfied)
      System.out.println(1);
    else
      System.out.println(0);
  }
}
