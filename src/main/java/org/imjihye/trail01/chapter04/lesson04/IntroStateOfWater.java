package org.imjihye.trail01.chapter04.lesson04;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/intro-state-of-water/description">LINK</a>
 */
public class IntroStateOfWater {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int water_temperature = sc.nextInt();

    if (water_temperature < 0)
      System.out.print("ice");
    else if (water_temperature >= 100)
      System.out.print("vapor");
    else
      System.out.print("water");
  }
}
