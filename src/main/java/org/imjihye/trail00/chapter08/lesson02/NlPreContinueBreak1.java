package org.imjihye.trail00.chapter08.lesson02;

import java.util.*;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/nl-pre-continue-break-1/description">LINK</a>
 */
public class NlPreContinueBreak1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int cnt = 0;

    for (int i = 1; i <= n; i++) {

      if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0) {
        continue;
      }
      cnt += 1;
    }

    System.out.println(cnt);
  }
}
