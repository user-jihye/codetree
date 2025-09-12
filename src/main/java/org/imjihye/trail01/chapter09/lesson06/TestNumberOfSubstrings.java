package org.imjihye.trail01.chapter09.lesson06;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/test-number-of-substrings/description">LINK</a>
 */
public class TestNumberOfSubstrings {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String strA = sc.next();
    String strB = sc.next();

    int lenA = strA.length();
    int lenB = strB.length();

    int cnt = 0;
    for (int i = 0; i < lenA - lenB + 1; i++) {
      if (strA.substring(i, i + lenB).equals(strB))
        cnt++;
    }

    System.out.println(cnt);
  }
}
