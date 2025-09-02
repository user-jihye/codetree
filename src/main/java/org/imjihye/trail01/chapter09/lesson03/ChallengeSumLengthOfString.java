package org.imjihye.trail01.chapter09.lesson03;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-sum-length-of-string/description">LINK</a>
 */
public class ChallengeSumLengthOfString {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String[] str = new String[n];

    for (int i = 0; i < n; i++) {
      str[i] = sc.next();
    }

    int length = 0;
    int aCnt = 0;

    for (int i = 0; i < n; i++) {
      length += str[i].length();

      if (str[i].charAt(0) == 'a')
        aCnt++;
    }

    System.out.println(length + " " + aCnt);
  }
}
