package main.java.arrays.rotation;

import java.util.Arrays;

public class Rotation {

  public static void main(String[] args) {
    int[] a = {1, 2, 3, 4, 5, 6, 7};
    int d = 2;
    // rotate1(a, d);
    // rotate2(a, d);
    rotateRev(a, d);
    System.out.println(Arrays.toString(a));
  }


  // Search an element in a sorted and rotated array
  static boolean search(int[] a, int key) {

    return false;
  }

  // rotate by reversal algo
  static void rotateRev(int[] a, int d) {
    reverse(a, 0, d - 1);
    reverse(a, d, a.length - 1);
    reverse(a, 0, a.length - 1);
  }

  static void reverse(int[] a, int l, int h) {
    while (l < h) {
      int t = a[l];
      a[l++] = a[h];
      a[h--] = t;
    }
  }

  // rotate by one single reverse
  static void rotate2(int[] a, int d) {
    for (int i = 0; i < d; i++)
      rotateOne(a);
  }

  static void rotateOne(int[] a) {
    int t = a[0], i = 1;
    for (; i < a.length; i++) {
      a[i - 1] = a[i];
    }
    a[i - 1] = t;
  }

  static void rotate1(int[] a, int d) {
    int[] temp = new int[d];
    for (int i = 0; i < a.length; i++) {
      if (i < d) {
        temp[i] = a[i];
      } else {
        a[i - d] = a[i];
      }
    }

    for (int i = a.length - 1; i >= a.length - d; i--) {
      a[i] = temp[a.length - i - 1];
    }
  }
}
