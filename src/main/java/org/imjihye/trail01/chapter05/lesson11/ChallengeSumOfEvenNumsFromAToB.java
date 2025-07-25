package org.imjihye.trail01.chapter05.lesson11;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-sum-of-even-nums-from-a-to-b/description">LINK</a>
 */
public class ChallengeSumOfEvenNumsFromAToB {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int a, b, sum = 0;
    a = sc.nextInt();
    b= sc.nextInt();

    for (int i = a; i <= b; i++) {
      if (i % 2 == 0) {
        sum += i;
      }
    }
    System.out.println(sum);
  }
}
