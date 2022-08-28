package main.java.number.theory.cn;

public class GCD {

  public static void main(String[] args) {
    System.out.println(gcd(68, 51));
  }

  static int gcd(int a, int b) {
    if (b > a)
      return gcd(b, a);

    if (b == 0)
      return a;

    return gcd(b, a % b);
  }
}
