package org.imjihye.trail00.chapter03.lesson04;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/nl-pre-else-if-3/description">LINK</a>
 */
public class NlPreElseIf3 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int score = sc.nextInt();
    char grade;

    if (score >= 90) {
      grade = 'A';
    } else if (score >= 80) {
      grade = 'B';
    } else if (score >= 70) {
      grade = 'C';
    } else if (score >= 60) {
      grade = 'D';
    } else {
      grade = 'F';
    }

    System.out.println(grade);

  }
}
