package org.imjihye.trail01.chapter03.lesson02;

import java.util.*;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-sum-and-mean-of-three-numbers/description">LINK</a>
 */
public class ChallengeSumAndMeanOfThreeNumbers {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    System.out.println(a + b + c);
    System.out.println((a + b + c) / 3);
  }
}
