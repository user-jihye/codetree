package org.imjihye.trail01.chapter04.lesson12;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/intro-sex-and-age/description">LINK</a>
 */
public class IntroSexAndAge {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int gender, age;
    gender = sc.nextInt();
    age = sc.nextInt();

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
