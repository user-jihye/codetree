package org.imjihye.trail01.chapter07.lesson03;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-reach-100/description">LINK</a>
 */
public class ChallengeReach100 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int[] arr = new int[100];
    arr[0] = 1;
    arr[1] = sc.nextInt();
    int point100 = 0;

    for (int i = 2; i < 100; i++) {
      arr[i] =  arr[i-2] + arr[i-1];

      if (arr[i] > 100) {
        point100 = i;
        break;
      }
    }

    for (int i = 0; i <= point100; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
