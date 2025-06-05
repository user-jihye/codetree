package org.imjihye.trail00.chapter03.lesson03;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/nl-pre-else-1/description">LINK</a>
 */
public class NlPreElse1 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    if (n >= 80) {
      System.out.println("pass");
    } else {
      int score = 80 - n;
      System.out.println(score + " more score");
    }
    
  }
}
