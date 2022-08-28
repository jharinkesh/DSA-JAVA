package main.java.number.theory.cn;

import java.util.Arrays;

public class PrimeSieve {

  // 480844
  // 40071

  public static void main(String[] args) {
    int n = 480844;
    boolean[] sieve = new boolean[n];
    Arrays.fill(sieve, true);
    sieve[0] = false;
    sieve[1] = false;

    for (int i = 2; i * i < n; i++) {
      if (sieve[i]) {
        for (int j = i * i; j < n; j += i) {
          sieve[j] = false;
        }
      }
    }

    int count = 0;
    for (boolean b : sieve) {
      if (b)
        count++;
    }

    System.out.println(count);
  }
}
