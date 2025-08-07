package org.imjihye.trail01.chapter06.lesson14;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-nineteen-times-table/description">LINK</a>
 */
public class ChallengeNineteenTimesTable {

  public static void main(String[] args) {
    for (int i = 1; i <= 19; i++) {
      for (int j = 1; j <= 19; j++) {
        if (j == 19)
          System.out.println(i + " * " + j + " = " + i*j);
        else if (j % 2 == 1)
          System.out.print(i + " * " + j + " = " + i*j + " / ");
        else
          System.out.println(i + " * " + j + " = " + i*j);
      }
    }
  }
}
