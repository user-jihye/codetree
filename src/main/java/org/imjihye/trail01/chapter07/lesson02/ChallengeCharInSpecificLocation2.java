package org.imjihye.trail01.chapter07.lesson02;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-char-in-specific-location-2/description">LINK</a>
 */
public class ChallengeCharInSpecificLocation2 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    char[] arr = new char[10];

    for (int i = 0; i < 10; i++) {
      arr[i] = sc.next().charAt(0);
    }

    System.out.println(arr[1] + " " + arr[4] + " " + arr[7]);
  }
}
