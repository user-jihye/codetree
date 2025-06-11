package org.imjihye.trail00.chapter04.lesson02;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/nl-pre-for-2/description">LINK</a>
 */
public class NlPreFor2 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    for (int i = 1; i <= 5; i++) {
      System.out.print((num * i) + " ");
    }
    
  }
}
