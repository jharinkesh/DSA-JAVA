package main.java.arrays.core;

public class FindDuplicate {

  public static void main(String[] args) {
    int[] a = {3, 6, 8, 8, 10, 12, 15, 15, 15, 20};
    findDuplicate(a);
  }

  static void findDuplicate(int[] a) {
    int lastDuplicate = -1;
    for (int i = 1; i < a.length; i++) {
      if (a[i] == a[i - 1] && a[i] != lastDuplicate) {
        System.out.print(a[i] + " ");
        lastDuplicate = a[i];
      }
    }
  }
}
