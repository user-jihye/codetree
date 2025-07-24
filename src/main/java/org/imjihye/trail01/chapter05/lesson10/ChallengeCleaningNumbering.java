package org.imjihye.trail01.chapter05.lesson10;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-cleaning-numbering/description">LINK</a>
 */
public class ChallengeCleaningNumbering {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int classroom = 0;
    int hall = 0;
    int toilet = 0;

    for (int i = 1; i <= n; i++) {
      if (i % 12 == 0) {
        toilet++;
      } else if (i % 3 == 0) {
        hall++;
      } else if (i % 2 == 0) {
        classroom++;
      }
    }

    System.out.println(classroom + " " + hall + " " + toilet);
  }
}
