package org.imjihye.trail00.chapter07.lesson01;

import java.util.*;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/nl-pre-string-2/description">LINK</a>
 */
public class NlPreString2 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String word1 = sc.next();
    String word2 = sc.next();

    int word1length = word1.length();
    int word2length = word2.length();

    if (word1length > word2length) {
      System.out.println(word1 + " " + word1length);
    } else if (word1length < word2length) {
      System.out.println(word2 + " " + word2length);
    } else {
      System.out.println("same");
    }
  }
}
