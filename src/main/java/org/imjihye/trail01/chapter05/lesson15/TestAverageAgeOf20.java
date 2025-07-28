package org.imjihye.trail01.chapter05.lesson15;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/test-average-age-of-20/description">LINK</a>
 */
public class TestAverageAgeOf20 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int sum = 0, cnt = 0;

    while (true) {
      int age = sc.nextInt();

      if (age > 29) {
        break;
      }

      sum += age;
      cnt++;
    }

    double avg = (double) sum / cnt;
    System.out.printf("%.2f", avg);
  }
}
