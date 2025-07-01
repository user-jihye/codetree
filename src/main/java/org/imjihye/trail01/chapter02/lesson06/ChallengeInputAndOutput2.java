package org.imjihye.trail01.chapter02.lesson06;

import java.util.*;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-input-and-output-2/description">LINK</a>
 */
public class ChallengeInputAndOutput2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String residentRegistrationNumber = sc.next();
//    String[] strArr = residentRegistrationNumber.split("-");

//    System.out.print(strArr[0] + strArr[1]);
    System.out.print(residentRegistrationNumber.replace("-", ""));
  }
}
