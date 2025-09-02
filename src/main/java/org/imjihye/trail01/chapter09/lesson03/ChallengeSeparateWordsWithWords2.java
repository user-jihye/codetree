package org.imjihye.trail01.chapter09.lesson03;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-separate-words-with-words-2/description">LINK</a>
 */
public class ChallengeSeparateWordsWithWords2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String[] str = new String[10];

    for (int i = 0; i < 10; i++)
      str[i] = sc.next();


    for (int i = 0; i < 10; i++) {
      if ((i+1) % 2 == 1)
        System.out.println(str[i]);
    }
  }
}
