package main.java.arrays.adnan;

public class SumOfBigNumbers {

  public static void main(String[] args) {
    System.out.println(sum("9999999999999999999", "1"));
  }

  static String sum(String a, String b) {
    if (b.length() > a.length()) {
      String t = a;
      a = b;
      b = t;
    }
    int[] list = new int[a.length()];
    int c = 0;

    for (int i = a.length() - 1; i >= 0; i--) {
      int sum = Integer.valueOf(a.charAt(i) + "") + c;
      int aindex = a.length() - i - 1;
      int bindex = b.length() - aindex - 1;
      if (bindex >= 0) {
        sum = sum + Integer.valueOf(b.charAt(bindex) + "");
      }
      if (sum >= 10) {
        list[i] = sum - 10;
        c = 1;
      } else {
        list[i] = sum;
        c = 0;
      }
    }

    StringBuilder sb = new StringBuilder();
    if (c == 1) {
      sb.append(c);
    }

    for (int i : list) {
      sb.append(i);
    }

    return sb.toString();
  }

}
