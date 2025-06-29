package org.imjihye.trail01.chapter01.lesson07;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/intro-replacing-variable-values-3/description">LINK</a>
 */
public class IntroReplacingVariableValues3 {

  public static void main(String[] args) {
    int a = 3, b = 5;
    int temp;
    temp = a;
    a = b;
    b = temp;
    System.out.println(a);
    System.out.println(b);
  }
}
