package org.imjihye.trail01.chapter01.lesson08;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/intro-copying-variable-values/description">LINK</a>
 */
public class IntroCopyingVariableValues {

  public static void main(String[] args) {
    int a = 1, b = 2, c = 3;
    a = b = c;
    System.out.printf("%d %d %d",a ,b, c);
  }
}
