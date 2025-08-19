package org.imjihye.trail01.chapter07.lesson05;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-play-with-array/description">LINK</a>
 */
public class ChallengePlayWithArray {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n, q;
    n = sc.nextInt();
    q = sc.nextInt();

    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    for (int i = 0; i < q; i++) {
      int type = sc.nextInt();

      if (type == 1) {
        int num = sc.nextInt();
        System.out.println(arr[num-1]);


      } else if (type == 2) {
        int num, idx;
        num = sc.nextInt();
        idx = -1;
        for (int j = n-1; j >= 0; j--) {
          if (arr[j] == num)
            idx = j;
        }

        if (idx == -1) {
          System.out.println(0);
        } else {
          System.out.println(idx+1);
        }

        
      } else if (type == 3) {
        int num1, num2;
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        for (int j = num1; j <= num2; j++) {
          System.out.print(arr[j-1] + " ");
        }
        System.out.println();
      }
    }
  }
}
