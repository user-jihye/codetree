package org.imjihye.trail01.chapter09.lesson02;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/test-output-based-on-space/description">LINK</a>
 */
public class TestOutputBasedOnSpace {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < 2; i++) {
      String str = sc.nextLine();
      for (int j = 0; j < str.length(); j++) {
        if (str.charAt(j) == ' ')
          continue;

        System.out.print(str.charAt(j));
      }
    }
  }
}
