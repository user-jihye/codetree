package org.imjihye.trail01.chapter04.lesson12;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-maximum-value/description">LINK</a>
 */
public class ChallengeMaximumValue {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a, b, c;
    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();

    if (a >= b && a >= c) {
      System.out.println(a);
    } else if (b >= a && b >= c) {
      System.out.println(b);
    } else {
      System.out.println(c);
    }
  }
}
