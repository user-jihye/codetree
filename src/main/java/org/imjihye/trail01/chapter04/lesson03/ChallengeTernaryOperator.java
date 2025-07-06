package org.imjihye.trail01.chapter04.lesson03;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-ternary-operator/description">LINK</a>
 */
public class ChallengeTernaryOperator {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int score = sc.nextInt();
    String grade = score == 100 ? "pass" : "failure";
    System.out.print(grade);
  }
}
