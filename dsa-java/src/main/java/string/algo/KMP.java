package main.java.string.algo;

import java.util.Arrays;

public class KMP {


  public static void main(String[] args) {
    String s = "aabaabaaa";
    System.out.println(Arrays.toString(getLPS(s.toCharArray())));
  }

  static int[] getLPS(char[] p) {
    int[] lps = new int[p.length];
    int j = 0, i = 1;
    lps[0] = 0;
    while (j < p.length) {
      if (p[j] == p[i]) {
        lps[i] = j + 1;
        j++;
        i++;
      } else {
        if (j != 0) {
          j = lps[j - 1];
        } else {
          lps[i] = 0;
          i++;
        }
      }
    }
    return lps;
  }

}
