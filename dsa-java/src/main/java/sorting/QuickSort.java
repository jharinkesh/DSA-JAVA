package sorting;

import java.util.Arrays;

public class QuickSort {

  public static void main(String[] args) {
    int[] a = {9, 2, 6, 1, 7, 9, 3};
    quicksort(a, 0, a.length - 1);
    System.out.println(Arrays.toString(a));
  }

  static void quicksort(int[] a, int start, int end) {
    if (start < end) {
      int pindex = partition(a, start, end);
      quicksort(a, start, pindex - 1);
      quicksort(a, pindex + 1, end);
    }
  }

  static int partition(int[] a, int start, int end) {
    int pivot = a[end], pi = start;
    for (int i = start; i < end; i++) {
      if (a[i] <= pivot) {
        swap(a, pi, i);
        pi++;
      }
    }
    swap(a, pi, end);
    return pi;
  }

  static void swap(int[] a, int i, int j) {
    int temp = a[i];
    a[i] = a[j];
    a[j] = temp;
  }

}
