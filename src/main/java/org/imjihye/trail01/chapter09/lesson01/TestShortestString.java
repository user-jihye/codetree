package org.imjihye.trail01.chapter09.lesson01;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/test-shortest-string/description">LINK</a>
 */
public class TestShortestString {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String str1 = sc.next();
    String str2 = sc.next();
    String str3 = sc.next();

    int len1 = str1.length();
    int len2 = str2.length();
    int len3 = str3.length();

    int longest = len1;
    if (longest < len2) longest = len2;
    if (longest < len3) longest = len3;

    int shortest = len1;
    if (shortest > len2) shortest = len2;
    if (shortest > len3) shortest = len3;

    System.out.println(longest - shortest);
  }
}
