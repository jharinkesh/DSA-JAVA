package main.java.arrays.rotation;

public class MaxDiffererence {

  public static void main(String[] args) {
    int[] a = {2, 3, 10, 6, 4, 8, 1};
    System.out.println(maxDiff(a));
  }

  static int maxDiff(int[] a) {
    int d = a[1] - a[0], min = a[0];
    for (int i = 1; i < a.length; i++) {
      d = Integer.max(d, a[i] - min);
      min = Integer.min(min, a[i]);
    }
    return d;
  }

}
