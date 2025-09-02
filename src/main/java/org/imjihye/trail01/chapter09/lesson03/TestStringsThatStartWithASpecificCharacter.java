package org.imjihye.trail01.chapter09.lesson03;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/test-strings-that-start-with-a-specific-character/description">LINK</a>
 */
public class TestStringsThatStartWithASpecificCharacter {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String[] str = new String[n];

    for (int i = 0; i < n; i++)
      str[i] = sc.next();

    char x = sc.next().charAt(0);
    int cnt = 0;
    int len = 0;
    for (int i = 0; i < n; i++) {
      if (str[i].charAt(0) == x) {
        cnt++;
        len += str[i].length();
      }
    }

    double avg = (double) len / cnt;
    System.out.printf("%d %.2f", cnt, avg);
  }
}
