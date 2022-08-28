package main.java.recursion.cn;

import java.util.Arrays;

public class allsubsequence {

  public static void main(String[] args) {
    String input = "abcd";
    String[] s = new String[pow(2, input.length())];
    System.out.println("count: " + getAll(input, s));
    System.out.println(Arrays.toString(s));
  }

  static int pow(int a, int b) {
    if (b == 0)
      return 1;

    return a * pow(a, b - 1);
  }


  static int getAll(String input, String[] s) {
    if (input.isBlank()) {
      s[0] = "";
      return 1;
    }
    int count = getAll(input.substring(1), s);
    for (int i = 0; i < count; i++)
      s[i + count] = input.substring(0, 1) + s[i];
    return 2 * count;
  }
}
