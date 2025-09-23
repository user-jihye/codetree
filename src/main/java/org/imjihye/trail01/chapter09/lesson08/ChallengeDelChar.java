package org.imjihye.trail01.chapter09.lesson08;

import java.util.*;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-del-char/description">LINK</a>
 */
public class ChallengeDelChar {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String str = sc.next();

    while (str.length() > 1) {
      int idx = sc.nextInt();
      int len = str.length();

      if (idx >= len) {
        str = str.substring(0, len-1);
      } else {
        str = str.substring(0, idx) + str.substring(idx+1, len);
      }

      System.out.println(str);
    }
  }
}
