package org.imjihye.trail01.chapter05.lesson07;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-a-divide-b/description">LINK</a>
 */
public class ChallengeADivideB {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a, b;
    a = sc.nextInt();
    b = sc.nextInt();

    System.out.print((a / b) + ".");
    int remainder = a % b;

    // (a / b)에서 소수점을 구하는 방법 :
    // (a를 b로 나눈 나머지에 * 10) / b로 나눴을 때의 몫
    for (int i = 0; i < 20; i++) {
      System.out.print((remainder * 10) / b);
      remainder = (remainder * 10) % b;
    }
  }
}
