package org.imjihye.trail01.chapter09.lesson02;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-count-char/description">LINK</a>
 */
public class ChallengeCountChar {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    char chr = sc.next().charAt(0);

    int cnt = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == chr) {
        cnt++;
      }
    }

    System.out.println(cnt);
  }
}
