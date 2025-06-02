package org.imjihye.trail00.chapter02.lesson03;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/nl-pre-input-1/description">LINK</a>
 */
public class NlPreInput1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double c = sc.nextDouble();

    System.out.printf("%.3f\n", a);
    System.out.printf("%.3f\n", b);
    System.out.printf("%.3f", c);
    
  }
}
