package org.imjihye.trail00.chapter07.lesson01;

import java.util.*;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/nl-pre-string-3/description">LINK</a>
 */
public class NlPreString3 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    String new_str = str.charAt(0) + "a" + str.substring(2, str.length()-2) + 'a' + str.charAt(str.length()-1);
    System.out.println(new_str);
  }
}
