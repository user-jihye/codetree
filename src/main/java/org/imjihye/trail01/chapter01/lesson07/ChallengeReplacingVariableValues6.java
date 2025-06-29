package org.imjihye.trail01.chapter01.lesson07;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-replacing-variable-values-6/description">LINK</a>
 */
public class ChallengeReplacingVariableValues6 {

  public static void main(String[] args) {
    int a = 2, b = 5;
    int temp;

    temp = a;
    a = b;
    b = temp;

    System.out.println(a);
    System.out.println(b);
  }
}
