package org.imjihye.trail01.chapter09.lesson07;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/intro-filling-with-a/description">LINK</a>
 */
public class IntroFillingWithA {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String str = sc.next();

    char[] arr = str.toCharArray();
    int len = arr.length;
    arr[1] = 'a';
    arr[len - 2] = 'a';

    str = String.valueOf(arr);
    System.out.println(str);
  }
}
