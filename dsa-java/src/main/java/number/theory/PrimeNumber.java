package number.theory;

import java.util.Arrays;

public class PrimeNumber {

  public static void main(String[] args) {
    // System.out.println(checkPrime(29));
    prime_sieve(100);
  }


  static boolean checkPrime(int n) {
    for (int i = 2; i * i <= n; i++) {
      if (n % i == 0)
        return false;
    }
    return true;
  }

  static void prime(int n) {
    for (int i = 1; i <= n; i++) {
      if (checkPrime(i))
        System.out.println(i + ": " + true);
    }
  }

  static void prime_sieve(int n) {
    boolean[] sieve = new boolean[n + 1];
    Arrays.fill(sieve, true);
    sieve[0] = false;
    sieve[1] = false;

    for (int i = 2; i <= n; i++) {
      if (sieve[i]) {
        System.out.println(i + " : " + sieve[i]);
        for (int j = i * 2; j <= n; j = j + i) {
          sieve[j] = false;
        }
      }
    }

  }


}
