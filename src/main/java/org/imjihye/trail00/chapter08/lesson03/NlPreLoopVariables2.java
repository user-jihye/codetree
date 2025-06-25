package org.imjihye.trail00.chapter08.lesson03;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/nl-pre-loop-variables-2/description">LINK</a>
 */
public class NlPreLoopVariables2 {

  public static void main(String[] args) {
    int cnt_3 = 0;
    int cnt_5 = 0;

    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < 10; i++) {
      int num = sc.nextInt();

      if (num % 3 == 0) {
        cnt_3 += 1;
      }

      if (num % 5 == 0) {
        cnt_5 += 1;
      }
    }

    System.out.println(cnt_3 + " " + cnt_5);

  }
}
