package org.imjihye.trail01.chapter07.lesson02;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/test-characteristics-of-elements-in-an-array/description">LINK</a>
 */
public class TestCharacteristicsOfElementsInAnArray {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int[] arr = new int[10];

    for (int i = 0; i < 10; i++) {
      arr[i] = sc.nextInt();

      if (arr[i] % 3 == 0) {
        System.out.println(arr[i - 1]);
        break;
      }
    }
  }
}
