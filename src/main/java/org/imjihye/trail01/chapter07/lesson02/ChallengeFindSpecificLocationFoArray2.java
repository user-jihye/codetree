package org.imjihye.trail01.chapter07.lesson02;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-find-specific-location-fo-array-2/description">LINK</a>
 */
public class ChallengeFindSpecificLocationFoArray2 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int[] arr = new int[10];
    int evenSum = 0, oddSum = 0;

    for (int i = 0; i < 10; i++) {
      arr[i] = sc.nextInt();

      if ((i+1) % 2 == 0)
        evenSum += arr[i];
      else
        oddSum += arr[i];
    }

    if (evenSum > oddSum)
      System.out.println(evenSum - oddSum);
    else
      System.out.println(oddSum - evenSum);
  }
}
