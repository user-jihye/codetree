package org.imjihye.trail01.chapter01.lesson04;

/**
 * @see <a href="https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-change-length-unit/description">LINK</a>
 */
public class ChallengeChangeLengthUnit {

  public static void main(String[] args) {
    double ftToCm = 30.48, miToCm = 160934;
    double ft = 9.2, mi = 1.3;

    System.out.printf("%.1fft = %.1fcm\n", ft, ft * ftToCm);
    System.out.printf("%.1fmi = %.1fcm", mi, mi*miToCm);
  }
}
