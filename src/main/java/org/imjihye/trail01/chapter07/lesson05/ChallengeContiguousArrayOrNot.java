package org.imjihye.trail01.chapter07.lesson05;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-contiguous-array-or-not/description">LINK</a>
 */
public class ChallengeContiguousArrayOrNot {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n1, n2;
    n1 = sc.nextInt();
    n2 = sc.nextInt();

    int[] a = new int[n1];
    int[] b = new int[n2];

    for (int i = 0; i < n1; i++) {
      a[i] = sc.nextInt();
    }

    for (int i = 0; i < n2; i++) {
      b[i] = sc.nextInt();
    }

    boolean isFind = false;
    for (int i = 0; i <= n1 - n2; i++) {
      if (a[i] == b[0]) {
        isFind = true;
        for (int j = 1; j < n2; j++) {
          if (a[i + j] != b[j]) {
            isFind = false;
            break;
          }
        }
      }
    }

    if (isFind) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
