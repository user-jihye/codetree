package org.imjihye.trail01.chapter09.lesson09;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/test-push-by-the-rules/description">LINK</a>
 */
public class TestPushByTheRules {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    int len = str.length();
    String dir = sc.next();

    for (int i = 0; i < dir.length(); i++) {
      if (dir.charAt(i) == 'L')
        str = str.substring(1) + str.substring(0, 1);

      else if(dir.charAt(i) == 'R')
        str = str.substring(len - 1) + str.substring(0, len - 1);
    }
    System.out.println(str);
  }
}
