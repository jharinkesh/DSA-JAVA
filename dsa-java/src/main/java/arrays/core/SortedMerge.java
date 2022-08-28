package main.java.arrays.core;

import java.util.Arrays;

public class SortedMerge {

  public static void main(String[] args) {
    int a[] = {2, 6, 9, 10, 14, 16, 18, 20};
    int b[] = {1, 4, 7, 8, 9};
    System.out.println(Arrays.toString(merge(a, b)));
  }

  static int[] merge(int[] a, int[] b) {
    int i = 0, j = 0, k = 0;
    int[] c = new int[a.length + b.length];
    while (i < a.length && j < b.length) {
      if (a[i] < a[j])
        c[k++] = a[i++];
      else
        c[k++] = b[j++];
    }

    while (i < a.length)
      c[k++] = a[i++];

    while (j < b.length)
      c[k++] = b[j++];

    return c;
  }

}
