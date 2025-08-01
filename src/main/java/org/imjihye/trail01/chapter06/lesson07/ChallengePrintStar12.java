package org.imjihye.trail01.chapter06.lesson07;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-print-star-12/description">LINK</a>
 */
public class ChallengePrintStar12 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    // 방법1
    for (int i = 0; i < n; i++) {
      for(int j = 0; j < n; j++) {
        if (j % 2 == 0) {
          if (i == 0)
            System.out.print("* ");
          else
            System.out.print("  ");
        } else {
          if (i <= j)
            System.out.print("* ");
          else
            System.out.print("  ");
        }
      }
      System.out.println();
    }

    // 방법2
//    for (int y = 0; y < n; y++) {
//      for (int x = 0; x < n; x++) {
//        if (y == 0 || (y <= x && x % 2 == 1)) {
//          System.out.printf("* ");
//          continue;
//        }
//
//        System.out.printf("  ");
//      }
//      System.out.println();
//    }


    // 방법3
//    for (int i = 0; i < n; i++) {
//      for (int j = 0; j < n; j++) {
//        if (j % 2 == 0) {
//          if (i == 0) {
//            System.out.print("* ");
//          } else {
//            System.out.print("  ");
//          }
//        } else {
//          if (i <= j) {
//            System.out.print("* ");
//          } else {
//            System.out.print("  ");
//          }
//        }
//      }
//      System.out.println();
//    }


    // 방법4(배열)
//    String[][] arr = new String[n][n];
//
//    for (int i = 0; i < n; i++) {
//      for (int j = 0; j < n; j++) {
//        arr[i][j] = "  ";
//      }
//    }
//
//    for (int j = 0; j < n; j++) {
//      for (int i = 0; i <= j; i++) {
//        if (j % 2 == 0) {
//          arr[0][j] = "* ";
//        } else {
//          arr[i][j] = "* ";
//        }
//      }
//    }
//
//    for (int i = 0; i < n; i++) {
//      for (int j = 0; j < n; j++) {
//        System.out.print(arr[i][j]);
//      }
//      System.out.println();
//    }



  }
}
