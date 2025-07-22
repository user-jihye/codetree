package org.imjihye.trail01.chapter04.lesson11;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-scholarship/description">LINK</a>
 */
public class ChallengeScholarship {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int midtermExam, finalExam;
    midtermExam = sc.nextInt();
    finalExam = sc.nextInt();

    if (midtermExam >= 90 && finalExam >= 95) {
      System.out.println(100000);
    } else if(midtermExam >= 90 && finalExam >= 90) {
      System.out.println(50000);
    } else {
      System.out.println(0);
    }
  }
}
