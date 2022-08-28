package main.java.arrays.adnan;

import java.util.Arrays;

public class P6_6_BUY_AND_SELL_STOCK_ONCE {

  public static void main(String... args) {
    // int[] input = {310, 315, 275, 295, 260, 270, 290, 230, 255, 250};
    // System.out.println(getMaxProfitV2(input, 30));
    int[] in = {2, 4, 5, 5, 5, 7, 8, 9, 9, 9, 9, 4, 4};
    System.out.println(getLongestEqualSubarrayLength(in));

  }

  static int getMaxProfit(int[] a, int limit) {
    int max = 0, n = a.length;
    Arrays.sort(a);
    for (int i = 0; i < n; i++) {
      int diff = a[n - i - 1] - a[i];
      max = diff > max && diff <= limit ? diff : max;
    }
    return max;
  }

  // Write a program that takes an array of integers and finds the length of a
  // longest subarray all of whose entries are equal.
  static int getLongestEqualSubarrayLength(int a[]) {
    int length = 1, max = 1, p = a[0], i = 1;
    while (i < a.length) {
      if (p == a[i])
        length++;
      else {
        max = length > max ? length : max;
        length = 1;
      }
      p = a[i];
      i++;
    }
    max = length > max ? length : max;
    return max;
  }

  static int getMaxProfitV2(int[] a, int limit) {
    int maxProfit = 0;
    int min = 0;
    for (int i : a) {
      min = Math.min(i, min);
      int m = Math.max(i - min, maxProfit);
      maxProfit = m > maxProfit && m <= limit ? m : maxProfit;
    }
    return maxProfit;
  }
}
