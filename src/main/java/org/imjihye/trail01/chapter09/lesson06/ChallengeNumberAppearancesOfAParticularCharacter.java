package org.imjihye.trail01.chapter09.lesson06;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-number-appearances-of-a-particular-character/description">LINK</a>
 */
public class ChallengeNumberAppearancesOfAParticularCharacter {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    int eeCnt = 0;
    int ebCnt = 0;

    for (int i = 0; i < str.length() - 1; i++) {

      if (str.substring(i, i + 2).equals("ee"))
        eeCnt++;

      if (str.charAt(i) == 'e' && str.charAt(i+1) == 'b')
        ebCnt++;
    }

    System.out.println(eeCnt + " " + ebCnt);
  }
}
