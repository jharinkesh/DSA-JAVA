package number.theory;

public class Power {

  public static void main(String[] args) {

    System.out.println(power(2, 5));
    System.out.println(power(2, 8));

  }

  static int power(int a, int b) {
    if (a == 0)
      return 0;
    if (b == 0)
      return 1;

    int val = power(a, b / 2);
    int ans = val * val;
    if (b % 2 != 0)
      ans = ans * a;
    return ans;
  }
}
