package org.imjihye.trail01.chapter03.lesson01;

import java.util.*;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/intro-square-width-after-length-change/description">LINK</a>
 */
public class IntroSquareWidthAfterLengthChange {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int w = sc.nextInt();
    int h = sc.nextInt();

    w += 8;
    h *= 3;

    System.out.println(w);
    System.out.println(h);
    System.out.println(w * h);
  }
}
