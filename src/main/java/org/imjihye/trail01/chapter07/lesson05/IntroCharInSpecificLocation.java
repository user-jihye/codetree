package org.imjihye.trail01.chapter07.lesson05;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/intro-char-in-specific-location/description">LINK</a>
 */
public class IntroCharInSpecificLocation {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    char chr = sc.next().charAt(0);
    
    char[] arr = new char[]{'L', 'E', 'B', 'R', 'O', 'S'};
    
    int idx = -1;
    for (int i = 0; i < 6; i++) {
      if (arr[i] == chr)
        idx = i;
    }

    if (idx == -1)
      System.out.println("None");
    else
      System.out.println(idx);
  }
}
