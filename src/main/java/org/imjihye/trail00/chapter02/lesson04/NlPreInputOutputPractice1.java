package org.imjihye.trail00.chapter02.lesson04;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/nl-pre-input-output-practice-1/description">LINK</a>
 */
public class NlPreInputOutputPractice1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();

    int sum_value = num1 + num2;
    System.out.print(sum_value + " ");
    System.out.print((sum_value/2.0));
  }
}
