package searching;

public class SubsetSum {


  public static void main(String[] args) {
    // int[] a = {2, 4, 8, 9, 11, 12, 20, 30};
    // System.out.println(hasPair(a, 0, 20));
    int[] a = {2, 3, 4, 10, 9, 20, 40};
    System.out.println(hasTriplet(a, 23));
  }

  static boolean hasTriplet(int[] a, int sum) {
    for (int i = 0; i < a.length; i++) {
      int subsetSum = sum - a[i];
      if (hasPair(a, i, subsetSum)) {
        return true;
      }
    }

    return false;
  }

  static boolean hasPair(int[] a, int l, int sum) {
    int r = a.length - 1;
    while (l < r) {
      if (a[l] + a[r] == sum)
        return true;
      else if (a[l] + a[r] > sum)
        r--;
      else
        l++;
    }

    return false;
  }

}
