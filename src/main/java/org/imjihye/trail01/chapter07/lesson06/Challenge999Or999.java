package org.imjihye.trail01.chapter07.lesson06;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-999-or-999/description">LINK</a>
 */
public class Challenge999Or999 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int[] arr = new int[100];
    int end = 0;
    for (int i = 0; i < 100; i++) {
      arr[i] = sc.nextInt();

      if (arr[i] == 999 || arr[i] == -999) {
        end = i;
        break;
      }
    }


    final int MAX_INT = Integer.MAX_VALUE;
    final int MIN_INT = Integer.MIN_VALUE;

    int maxVal = MIN_INT;
    int minVal = MAX_INT;

    for (int i = 0; i < end; i++) {
      if  (arr[i] > maxVal)
        maxVal = arr[i];

      if (arr[i] < minVal)
        minVal = arr[i];
    }

    System.out.println(maxVal + " " + minVal);
  }
}
