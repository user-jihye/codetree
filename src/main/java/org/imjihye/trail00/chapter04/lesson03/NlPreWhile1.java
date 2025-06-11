package org.imjihye.trail00.chapter04.lesson03;

import java.util.*;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/nl-pre-while-1/description">LINK</a>
 */
public class NlPreWhile1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();

    while (n > 0) {
      System.out.println(n);
      n /= m;
    }
    
  }
}
