import java.util.Scanner;


public class Testcase {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    if (t >= 0 && t <= 1000000) {
      for (int i = 0; i < t; i++) {
        int n = sc.nextInt();
        if (n >= 0 && n <= 1000000000) {
          solve(n, sc);
        }
      }
    }
    sc.close();
  }

  static void solve(int n, Scanner sc) {
    int min = sc.nextInt();
    for (int i = 1; i < n; i++) {
      int x = sc.nextInt();
      min = x < min ? x : min;
    }
    System.out.println(min);
  }

}
