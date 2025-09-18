package org.imjihye.trail01.chapter09.lesson07;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-exchange-1st-and-2nd/description">LINK</a>
 */
public class ChallengeExchange1stAnd2nd {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();

    char[] arr = str.toCharArray();
    char first = arr[0];
    char second = arr[1];

    for (int i = 0; i < arr.length; i++) {

      if (arr[i] == first)
        arr[i] = second;

      else if (arr[i] == second)
        arr[i] = first;
    }

    System.out.println(String.valueOf(arr));
  }
}
