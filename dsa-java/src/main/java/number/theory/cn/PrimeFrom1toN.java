package main.java.number.theory.cn;

import java.util.Scanner;

public class PrimeFrom1toN {

  public static void main(String[] args) {
    // Write your code here
    long n = new Scanner(System.in).nextLong();
    long count = 0;
    for (long i = 1; i <= n; i++) {
      if (isPrime(i)) {
        count++;
      }
    }
    System.out.println(count);
  }

  static boolean isPrime(Long num) {
    int count = 0;
    for (int i = 1; i * i <= num && count <= 2; i++) {
      if (num % i == 0) {
        if (i * i == num)
          count++;
        else
          count += 2;
      }
    }

    return count == 2;
  }
}
