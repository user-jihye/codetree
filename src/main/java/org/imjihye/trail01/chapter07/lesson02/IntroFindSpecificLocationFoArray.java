package org.imjihye.trail01.chapter07.lesson02;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/intro-find-specific-location-fo-array/description">LINK</a>
 */
public class IntroFindSpecificLocationFoArray {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int[] arr = new int[10];

    for (int i = 0; i < 10; i++) {
      arr[i] = sc.nextInt();
    }

    int twoSum = 0;
    int threeSum = 0, threeCnt = 0;

    for (int i = 0; i < 10; i++) {
      if (i % 2 == 1) {
        twoSum += arr[i];
      }

      if ((i+1) % 3 == 0) {
        threeSum += arr[i];
        threeCnt++;
      }
    }

    double threeAvg = (double) threeSum / threeCnt;

    System.out.printf("%d %.1f", twoSum, threeAvg);
  }
}
