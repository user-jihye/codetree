package org.imjihye.trail00.chapter03.lesson02;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/nl-pre-if-1/description">LINK</a>
 */
public class NlPreIf1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    System.out.println(N);

    if (N < 0) {
      System.out.println("minus");
    }
    
  }
}
