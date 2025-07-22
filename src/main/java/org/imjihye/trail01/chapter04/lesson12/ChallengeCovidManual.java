package org.imjihye.trail01.chapter04.lesson12;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-covid-manual/description">LINK</a>
 */
public class ChallengeCovidManual {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char cold;
    int temp;
    
    int cnt = 0;

    for (int i = 0; i < 3; i++) {
      cold = sc.next().charAt(0);
      temp = sc.nextInt();
      if (cold == 'Y' && temp >= 37) {
        cnt += 1;
      }
    }
    
    if (cnt >= 2) {
      System.out.println('E');
    } else {
      System.out.println('N');
    }
    
    
    
  }
}
