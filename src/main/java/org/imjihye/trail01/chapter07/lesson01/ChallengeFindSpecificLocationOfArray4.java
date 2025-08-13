package org.imjihye.trail01.chapter07.lesson01;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-find-specific-location-of-array-4/description">LINK</a>
 */
public class ChallengeFindSpecificLocationOfArray4 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] arr = new int[10];
    int cnt = 0, sum = 0;

    for (int i = 0; i < 10; i++) {
      arr[i] = sc.nextInt();

      if (arr[i] == 0)
        break;

      if (arr[i] % 2 == 0) {
        cnt++;
        sum += arr[i];
      }
    }

    System.out.println(cnt + " " + sum);

  }
}
