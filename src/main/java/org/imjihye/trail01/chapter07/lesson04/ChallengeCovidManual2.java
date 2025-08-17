package org.imjihye.trail01.chapter07.lesson04;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-covid-manual2/description">LINK</a>
 */
public class ChallengeCovidManual2 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int[] clinic = new int[4];

    for (int i = 0; i < 3; i++) {
      char cold = sc.next().charAt(0);
      int temp = sc.nextInt();

      if (temp >= 37) {
        if (cold == 'Y')
          clinic[0]++;
        else
          clinic[1]++;
      } else {
        if (cold == 'Y')
          clinic[2]++;
        else
          clinic[3]++;
      }
    }

    for (int i = 0; i < 4; i++) {
      System.out.print(clinic[i] + " ");
    }

    if (clinic[0] >= 2)
      System.out.print("E");
  }
}
