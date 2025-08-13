package org.imjihye.trail01.chapter07.lesson01;

import java.util.*;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/intro-reaching-specific-number/description">LINK</a>
 */
public class IntroReachingSpecificNumber {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[10];

    for (int i = 0; i < 10; i++) {
      arr[i] = sc.nextInt();
    }

    int sum = 0, cnt = 0;

    for (int i = 0; i < 10; i++) {
      if (arr[i] >= 250) {
        break;
      } else {
        sum += arr[i];
        cnt++;
      }
    }

    double avg = (double) sum / cnt;
    System.out.printf("%d %.1f", sum, avg);
  }
}
