package org.imjihye.trail01.chapter07.lesson01;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-verify-test-passed-2/description">LINK</a>
 */
public class ChallengeVerifyTestPassed2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int studentCnt = sc.nextInt();
    int passCnt = 0;

    for (int i = 0; i < studentCnt; i++) {

      int[] score = new int[4];
      int sumVal = 0;

      for (int j = 0; j < 4; j++) {
        score[j] = sc.nextInt();
        sumVal += score[j];
      }

      double avg = sumVal / 4.0;

      if (avg >= 60) {
        passCnt++;
        System.out.println("pass");
      }
      else {
        System.out.println("fail");
      }
    }

    System.out.println(passCnt);
  }
}
