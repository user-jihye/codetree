package org.imjihye.trail00.chapter02.lesson04;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/nl-pre-input-output-practice-2/description">LINK</a>
 */
public class NlPreInputOutputPractice2 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    int sum_value = a + b + c;
    int avg_value = sum_value / 3;

    System.out.println(sum_value);
    System.out.println(avg_value);
    System.out.println(sum_value - avg_value);
    
  }
}
