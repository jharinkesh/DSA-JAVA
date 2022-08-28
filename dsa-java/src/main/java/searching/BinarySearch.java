package searching;

public class BinarySearch {


  public static void main(String[] args) {
    int[] a = {4, 6, 7, 9, 10, 20, 32, 43};
    System.out.println(binarySearch(a, 0, a.length - 1, 4));
  }

  static int binarySearch(int[] a, int start, int end, int k) {
    if (start <= end) {
      int mid = (start + end) / 2;
      if (a[mid] == k)
        return mid;
      if (k < a[mid])
        return binarySearch(a, start, mid - 1, k);
      else
        return binarySearch(a, mid + 1, end, k);
    }
    return -1;
  }
}
