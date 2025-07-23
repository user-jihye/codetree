package org.imjihye.trail01.chapter05.lesson08;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-from-high-to-low/description">LINK</a>
 */
public class ChallengeFromHighToLow {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int a, b;
     a = sc.nextInt();
     b = sc.nextInt();

     if (a > b) {
       for (int i = a; i >= b; i--) {
         System.out.print(i + " ");
       }
     } else {
       for (int i = b; i >= a; i--) {
         System.out.print(i + " ");
       }
     }
  }
}
