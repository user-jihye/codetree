package org.imjihye.trail01.chapter09.lesson03;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-separate-words-with-words-3/description">LINK</a>
 */
public class ChallengeSeparateWordsWithWords3 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String[] str = new String[10];

    for (int i = 0; i < 10; i++)
      str[i] = sc.next();


    for (int i = 9; i >= 0; i--)
      System.out.println(str[i]);
  }
}
