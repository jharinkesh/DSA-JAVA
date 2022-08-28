package recursion;

import java.math.BigInteger;

public class factorial {

  public static void main(String[] args) {
    BigInteger x = BigInteger.valueOf(1);
    BigInteger y = BigInteger.valueOf(2000);
    fact2(x, y);
  }

  static void fact2(BigInteger x, BigInteger y) {
    long a1 = System.currentTimeMillis();
    int a = Integer.valueOf(x.toString());
    int b = Integer.valueOf(y.toString());
    BigInteger[] B = new BigInteger[b + 1];
    B[a] = fact(x);
    for (int i = a + 1; i <= b; i++) {
      BigInteger fact = B[i - 1].multiply(BigInteger.valueOf(i));
      B[i] = fact;
      System.out.println("factorial of " + i + " is: " + B[i]);
    }
    long b1 = System.currentTimeMillis();
    long c = b1 - a1;
    System.out.println("total time: " + c);
  }

  static void fact(BigInteger x, BigInteger y) {
    long a = System.currentTimeMillis();
    for (BigInteger i = x; i.compareTo(y) <= 0; i = i.add(BigInteger.valueOf(1))) {
      System.out.println("factorial of " + i + " is: " + fact(i));
      fact(i);
    }
    long b = System.currentTimeMillis();
    long c = b - a;
    System.out.println("total time: " + c);
  }

  static BigInteger fact(BigInteger n) {
    if (n.equals(0) || n.equals(0))
      return BigInteger.valueOf(1);
    BigInteger fact = BigInteger.valueOf(1);
    for (BigInteger i = n; i.compareTo(BigInteger.valueOf(1)) == 1; i =
        i.subtract(BigInteger.valueOf(1))) {
      fact = fact.multiply(i);
    }
    return fact;
  }
}
