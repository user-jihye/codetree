package org.imjihye.trail01.chapter03.lesson01;

import java.util.*;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-add-two-integers-each-other/description">LINK</a>
 */
public class ChallengeAddTwoIntegersEachOther {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    a += b;
    b += a;

    System.out.print(a + " " + b);
  }
}
