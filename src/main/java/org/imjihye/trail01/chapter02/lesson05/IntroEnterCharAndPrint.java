package org.imjihye.trail01.chapter02.lesson05;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/intro-enter-char-and-print/description">LINK</a>
 */
public class IntroEnterCharAndPrint {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char c = sc.next().charAt(0);
    System.out.print(c);
  }
}
