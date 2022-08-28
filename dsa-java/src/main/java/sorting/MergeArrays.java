package sorting;

import java.util.Arrays;

public class MergeArrays {

  public static void main(String[] args) {
    int[] a = {5, 6, 7};
    int[] b = {3, 4, 9, 9};
    System.out.println(Arrays.toString(merge(a, b)));
  }

  static int[] merge(int[] a, int[] b) {
    int i = 0, j = 0, k = 0, m = a.length, n = b.length;
    int[] c = new int[m + n];

    while (i < m && j < n)
      c[k++] = (a[i] < b[j]) ? a[i++] : b[j++];

    while (i < m)
      c[k++] = a[i++];

    while (j < n)
      c[k++] = b[j++];

    return c;
  }

}
