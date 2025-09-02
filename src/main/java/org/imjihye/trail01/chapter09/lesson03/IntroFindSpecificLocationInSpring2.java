package org.imjihye.trail01.chapter09.lesson03;

import java.util.*;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/intro-find-specific-location-in-spring-2/description">LINK</a>
 */
public class IntroFindSpecificLocationInSpring2 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    char x = sc.next().charAt(0);

    String[] str = new String[] {"apple", "banana", "grape", "blueberry", "orange"};

    int cnt = 0;
    for (int i = 0; i < 5; i++) {
      if (str[i].charAt(2) == x || str[i].charAt(3) == x) {
        cnt++;
        System.out.println(str[i]);
      }
    }

    System.out.println(cnt);
  }
}
