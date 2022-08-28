package main.java.arrays.core;

import java.util.Arrays;

public class Reverse {

  public static void main(String[] args) {
    int[] a = {1, 2, 3, 4, 5, 6, 7};
    reverse(a, 0, a.length - 1);
    System.out.println(Arrays.toString(a));
  }

  static void reverse(int[] a, int i, int j) {
    if (i < j) {
      int t = a[i];
      a[i] = a[j];
      a[j] = t;
      reverse(a, ++i, --j);
    }
  }
}
