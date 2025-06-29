package org.imjihye.trail01.chapter01.lesson07;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/test-exchange-data/description">LINK</a>
 */
public class TestExchangeData {

  public static void main(String[] args) {

    int a = 5, b = 6, c = 7;
    int temp;

    temp = a;
    a = c;
    c = b;
    b = temp;

    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
  }
}
