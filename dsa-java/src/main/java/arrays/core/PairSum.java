package main.java.arrays.core;

public class PairSum {

  public static void main(String[] args) {
    int[] a = {6, 3, 8, 10, 16, 7, 5, 2, 9, 14};
    pairSum(a, 10);
  }

  static void pairSum(int[] a, int sum) {
    int[] b = new int[sum + 1];
    for (int i = 0; i < a.length; i++) {
      if (a[i] <= sum) {
        int diff = sum - a[i];
        if (b[diff] == 1) {
          System.out.println(a[i] + " , " + diff);
        }
        b[a[i]] = 1;
      }
    }
  }

  static int max(int[] a) {
    int max = a[0];
    for (int i : a)
      max = Integer.max(max, i);
    return max;
  }
}
