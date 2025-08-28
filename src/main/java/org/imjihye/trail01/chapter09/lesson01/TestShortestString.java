package org.imjihye.trail01.chapter09.lesson01;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/test-shortest-string/description">LINK</a>
 */
public class TestShortestString {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String[] str = new String[3];
    for (int i = 0; i < 3; i++) {
      str[i] = sc.next();
    }

    int maxDiff = -1;
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        if (i == j)
          continue;

        if (str[i].length() - str[j].length() > maxDiff)
            maxDiff = str[i].length() - str[j].length();
      }
    }
    System.out.println(maxDiff);
  }
}
