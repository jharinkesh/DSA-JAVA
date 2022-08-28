package main.java.arrays.adnan;

import java.util.Arrays;

public class EvenOrderReorder {

  public static void main(String[] args) {
    int[] a = {5, 7, 9, 4, 6, 7, 2, 3, 60};
    evenOdd(a);
    System.out.println(Arrays.toString(a));
  }

  static void evenOdd(int[] a) {
    int i = 0, j = a.length - 1;
    while (i < j) {
      if (a[i] % 2 != 0) {
        if (a[j] % 2 == 0) {
          int t = a[i];
          a[i] = a[j];
          a[j] = t;
          i++;
        }
        j--;
      } else {
        i++;
      }
    }
  }
}
