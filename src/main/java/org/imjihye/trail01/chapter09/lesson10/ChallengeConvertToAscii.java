package org.imjihye.trail01.chapter09.lesson10;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-convert-to-ascii/description">LINK</a>
 */
public class ChallengeConvertToAscii {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char a = sc.next().charAt(0);
    int b = sc.nextInt();

    System.out.print((int) a + " " + (char) b);
  }
}
