package org.imjihye.trail01.chapter09.lesson05;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-paste-all-string/description">LINK</a>
 */
public class ChallengePasteAllString {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String totStr = "";

    for (int i = 0; i < n; i++)
      totStr += sc.next();

    System.out.print(totStr);
  }
}
