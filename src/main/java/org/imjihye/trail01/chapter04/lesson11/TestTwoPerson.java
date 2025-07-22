package org.imjihye.trail01.chapter04.lesson11;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/test-two-person/description">LINK</a>
 */
public class TestTwoPerson {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int age1, age2;
    String gender1, gender2;

    age1 = sc.nextInt();
    gender1 = sc.next();

    age2 = sc.nextInt();
    gender2 = sc.next();

    if ((age1 >= 19 && gender1.equals("M")) || (age2 >= 19 && gender2.equals("M"))) {
      System.out.println(1);
    } else {
      System.out.println(0);
    }
  }
}
