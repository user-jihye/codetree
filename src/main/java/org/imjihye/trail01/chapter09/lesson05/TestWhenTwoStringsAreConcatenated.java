package org.imjihye.trail01.chapter09.lesson05;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/test-when-two-strings-are-concatenated/description">LINK</a>
 */
public class TestWhenTwoStringsAreConcatenated {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String b = sc.next();

    if ((a + b).equals(b + a))
      System.out.print("true");
    else
      System.out.print("false");
  }
}
