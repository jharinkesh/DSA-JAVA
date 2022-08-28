package main.java.number.theory.cn;

public class Fibo {

  public static void main(String[] args) {
    System.out.println(sum(6, 10));

  }

  static int sum(int x, int y) {
    return fibo(y + 2) - fibo(x + 1);
  }

  static int fibo(int n) {
    if (n == 1 || n == 0)
      return n;
    else
      return fibo(n - 1) + fibo(n - 2);
  }

}
