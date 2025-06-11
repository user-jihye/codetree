package org.imjihye.trail00.chapter04.lesson02;

import java.util.*;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/nl-pre-for-3/description">LINK</a>
 */
public class NlPreFor3 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    for (int i = b; i >= a; i--) {
      System.out.print(i + " ");
    }
    
  }
}
