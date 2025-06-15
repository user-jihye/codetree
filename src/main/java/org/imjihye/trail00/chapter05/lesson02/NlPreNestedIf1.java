package org.imjihye.trail00.chapter05.lesson02;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/nl-pre-nested-if-1/description">LINK</a>
 */
public class NlPreNestedIf1 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int gender = sc.nextInt();
    int age = sc.nextInt();

    if (age >= 19) {
      if (gender == 0) {
        System.out.println("MAN");
      } else {
        System.out.println("WOMAN");
      }
    } else {
      if (gender == 0) {
        System.out.println("BOY");
      } else {
        System.out.println("GIRL");
      }
    }

  }
}
