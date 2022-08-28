package sorting;

import java.util.Arrays;

public class SelectionSort {

  public static void main(String[] args) {
    int[] a = {4, 6, 1, 3, 9, 8, 7};
    sort(a);
    System.out.println(Arrays.toString(a));
  }

  static void sort(int[] a) {
    int n = a.length;
    for (int i = 0; i < n; i++) {
      int minIndex = i;
      for (int j = i + 1; j < n; j++) {
        if (a[j] < a[minIndex])
          minIndex = j;
      }
      swap(a, i, minIndex);
    }
  }

  static void swap(int[] a, int i, int j) {
    int t = a[i];
    a[i] = a[j];
    a[j] = t;
  }


}
