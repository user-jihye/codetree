package org.imjihye.trail01.chapter09.lesson04;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-run-length-encoding/description">LINK</a>
 */
public class ChallengeRunLengthEncoding {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String str = sc.next();

    String encoding = "";
    char x = str.charAt(0);
    int cnt = 1;
    for (int i = 1; i < str.length(); i++) {

      if (str.charAt(i) == x) {
        cnt++;
      } else {
        encoding = encoding + x + cnt;
        x = str.charAt(i);
        cnt = 1;
      }
    }

    encoding = encoding + x + cnt;

    System.out.println(encoding.length());
    System.out.println(encoding);
  }
}
