package org.imjihye.trail01.chapter09.lesson10;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/test-before-the-alphabet/description">LINK</a>
 */
public class TestBeforeTheAlphabet {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char x = sc.next().charAt(0);

    if (x == 'a')
      System.out.print('z');
    else
      System.out.print((char) (x - 1));

  }
}
