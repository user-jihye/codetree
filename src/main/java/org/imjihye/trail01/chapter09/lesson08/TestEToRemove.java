package org.imjihye.trail01.chapter09.lesson08;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/test-e-to-remove/description">LINK</a>
 */
public class TestEToRemove {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String str = sc.next();

    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'e') {
        str = str.substring(0, i) + str.substring(i + 1);
        break;
      }
    }

    System.out.println(str);
  }
}
