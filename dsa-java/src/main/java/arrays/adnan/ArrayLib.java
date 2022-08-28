package main.java.arrays.adnan;

import java.util.Arrays;

public class ArrayLib {


  public static void main(String[] args) {
    // sortDemo();
    // equalsDemo();
    // deepEqualsDemo();
    // binarySearch();
    // copyOfDemo();
  }

  static void copyOfDemo() {
    int[] a = {11, 8, 5, 1, 9};
    // int[] b = Arrays.copyOf(a, 7);
    int[] b = Arrays.copyOfRange(a, 1, 3);
    System.out.println(Arrays.toString(b));
  }

  static void fillDemo() {
    int[] x = new int[10];
    // Arrays.fill(x, 99);
    Arrays.fill(x, 1, 5, 99);
    // System.out.println(Arrays.toString(x));
  }

  static void binarySearch() {
    int[] a = {11, 8, 5, 1, 9};
    // System.out.println(Arrays.binarySearch(a, 50));
    System.out.println(Arrays.binarySearch(a, 1, 3, 8));
  }

  static void equalsDemo() {
    int[] a = {11, 8, 5, 1, 9};
    int[] b = {11, 8, 5, 1, 9};
    System.out.println(Arrays.equals(a, b));
  }

  static void deepEqualsDemo() {
    int[][] a = {{11, 8, 5, 1, 9}, {23}};
    int[][] b = {{11, 8, 5, 1, 9}, {23}};
    System.out.println(Arrays.deepEquals(a, b));
  }

  static void sortDemo() {
    // int[] a = {11, 8, 5, 1, 7};
    Custom[] a = {new Custom(5), new Custom(3), new Custom(8)};
    // Arrays.sort(a);
    // Arrays.sort(a, (x, y) -> y.data - x.data);
    // Arrays.sort(a, 0, 2);
    System.out.println(Arrays.toString(a));
  }
}


class Custom implements Comparable<Custom> {
  int data;

  Custom(int data) {
    this.data = data;
  }

  public int compareTo(Custom obj) {
    return this.data - obj.data;
  }

  public String toString() {
    return data + "";
  }
}
