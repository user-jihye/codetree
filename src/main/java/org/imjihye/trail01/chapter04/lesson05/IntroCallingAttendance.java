package org.imjihye.trail01.chapter04.lesson05;

import java.util.*;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/intro-calling-attendance/description">LINK</a>
 */
public class IntroCallingAttendance {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    if (num == 1) {
      System.out.print("John");
    } else if (num == 2) {
      System.out.print("Tom");
    } else if (num == 3) {
      System.out.print("Paul");
    } else {
      System.out.print("Vacancy");
    }
  }
}
