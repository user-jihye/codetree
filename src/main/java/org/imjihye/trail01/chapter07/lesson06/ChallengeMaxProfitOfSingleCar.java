package org.imjihye.trail01.chapter07.lesson06;

import java.util.Scanner;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-max-profit-of-single-car/description">LINK</a>
 */
public class ChallengeMaxProfitOfSingleCar {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] price = new int[n];

    for (int i = 0; i < n; i++) {
      price[i] = sc.nextInt();
    }

    int maxProfit = 0;
    int profit;
    for (int i = 0; i < n; i++) {    // buy
      for (int j = i; j < n; j++) {  // sell
        profit = -(price[i] - price[j]);
        if (profit > maxProfit)
          maxProfit = profit;
      }
    }
    System.out.println(maxProfit);
  }
}
