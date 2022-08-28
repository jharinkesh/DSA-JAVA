package number.theory;

public class Euclid {

  public static void main(String[] args) {
    System.out.println(gcd(16, 12));
  }

  static int gcd(int a, int b) {
    if (b == 0)
      return a;
    if (b > a)
      return gcd(b, a);
    return gcd(b, a % b);
  }
}
