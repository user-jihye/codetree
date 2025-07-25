package org.imjihye.trail01.chapter05.lesson11;

import java.util.*;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-number-in-range-2/description">LINK</a>
 */
public class ChallengeNumberInRange2 {

  public static void main(String[] args) {
    int sum = 0, cnt = 0;
    double avg;

    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < 10; i++) {
      int num = sc.nextInt();

      if (num >= 0 && num <= 200) {
        sum += num;
        cnt++;
      }
    }

    avg = (double) sum / cnt;
    System.out.printf("%d %.1f", sum, avg);

  }
}
