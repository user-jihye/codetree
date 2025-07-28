package org.imjihye.trail01.chapter05.lesson15;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-continue-calculating-width-of-the-rectangle/description">LINK</a>
 */
public class ChallengeContinueCalculatingWidthOfTheRectangle {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (true) {
      int w, h;
      char chr;

      w = sc.nextInt();
      h = sc.nextInt();
      chr = sc.next().charAt(0);

      System.out.println(w * h);

      if (chr == 'C') {
        break;
      }
    }
  }
}
