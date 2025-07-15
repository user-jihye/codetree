package org.imjihye.trail01.chapter04.lesson06;

import java.util.*;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-numbers-condition-2/description">LINK</a>
 */
public class ChallengeNumbersCondition2 {

  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   int a = sc.nextInt();

   if (a == 5) {
     System.out.println("A");
   }

   if (a % 2 == 0) {
     System.out.println("B");
   }
  }
}
