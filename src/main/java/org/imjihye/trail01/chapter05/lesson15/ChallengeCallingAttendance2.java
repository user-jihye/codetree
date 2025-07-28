package org.imjihye.trail01.chapter05.lesson15;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-calling-attendance-2/description">LINK</a>
 */
public class ChallengeCallingAttendance2 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    while (true) {
      int num = sc.nextInt();
      if (num == 1)
        System.out.println("John");
      else if (num == 2)
        System.out.println("Tom");
      else if (num == 3)
        System.out.println("Paul");
      else if (num == 4)
        System.out.println("Sam");
      else{
        System.out.println("Vacancy");
        break;
      }

    }
  }
}
