package org.imjihye.trail00.chapter09.lesson04;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/nl-pre-1d-loop-repetition-2/description">LINK</a>
 */
public class NlPre1dLoopRepetition2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int start = sc.nextInt();
    int end = sc.nextInt();
    int cnt = 0;

    for (int i = start; i <= end; i++) {
      int temp = 0;

      for (int j = 1; j <= i; j++) {
        if (i % j == 0) {
          temp += 1;
        }
      }

      if (temp == 3) {
        cnt += 1;
      }
    }
    System.out.println(cnt);
  }
}
