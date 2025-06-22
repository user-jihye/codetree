package org.imjihye.trail00.chapter08.lesson02;

import java.util.*;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/nl-pre-continue-break-2/description">LINK</a>
 */
public class NlPreContinueBreak2 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int total = 0;

    for (int i = 1; i <= 100; i++) {

      total += i;

      if (total >= n) {
        System.out.println(i);
        break;
      }
    }

  }
}
