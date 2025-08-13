package org.imjihye.trail01.chapter07.lesson01;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-receive-10-inputs/description">LINK</a>
 */
public class ChallengeReceive10Inputs {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] arr = new int[10];
    int cnt = 0, sum = 0;

    for (int i = 0; i < 10; i++) {
      arr[i] = sc.nextInt();

      if (arr[i] == 0)
        break;

      sum += arr[i];
      cnt++;
    }

    double avg = (double) sum / cnt;
    System.out.printf("%d %.1f", sum, avg);
  }
}
