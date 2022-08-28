package sorting;

import java.util.Arrays;

public class MergeSort {

  public static void main(String[] args) {
    int[] a = {11, 9, 3, 5, 22, 3, 0, 5};
    mergeSort(a, 0, a.length - 1);
    System.out.println(Arrays.toString(a));
  }

  static void mergeSort(int[] a, int start, int end) {
    if (start < end) {
      // System.out.println(Arrays.toString(a));
      int mid = (start + end) / 2;
      mergeSort(a, start, mid);
      mergeSort(a, mid + 1, end);
      merge(a, start, mid, end);
    }
  }

  static int[] merge(int[] a, int start, int mid, int end) {
    int i = start, j = mid + 1, k = 0;
    int[] c = new int[end - start + 1];
    while (i <= mid && j <= end)
      c[k++] = (a[i] < a[j]) ? a[i++] : a[j++];

    while (i <= mid)
      c[k++] = a[i++];
    while (j <= end)
      c[k++] = a[j++];

    i = start;
    for (int e : c) {
      a[i++] = e;
    }

    // System.out.println(Arrays.toString(c));
    return c;
  }
}
