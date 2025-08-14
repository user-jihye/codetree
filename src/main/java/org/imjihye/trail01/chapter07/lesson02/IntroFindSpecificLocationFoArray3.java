package org.imjihye.trail01.chapter07.lesson02;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/intro-find-specific-location-fo-array-3/description">LINK</a>
 */
public class IntroFindSpecificLocationFoArray3 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int[] arr = new int[100];

    for (int i = 0; i < 100; i++) {
      arr[i] = sc.nextInt();

      if (arr[i] == 0) {
        System.out.println(arr[i-3] + arr[i-2] + arr[i-1]);
        break;
      }
    }

  }
}
