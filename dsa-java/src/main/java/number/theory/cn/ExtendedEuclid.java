package main.java.number.theory.cn;

public class ExtendedEuclid {



  public static void main(String[] args) {
    Triplet ans = extentedEuclid(16, 10);
    //System.out.println(ans);
  }

  static Triplet extentedEuclid(int a, int b) {
    Triplet ans = new Triplet();
    if (b == 0) {
      ans.gcd = a;
      ans.x = 1;
      ans.y = 0;
      return ans;
    }

    // extended euclid
    Triplet smallAns = extentedEuclid(b, a % b);
    ans.gcd = smallAns.gcd;
    ans.x = smallAns.y;
    ans.y = smallAns.x - (a / b) * smallAns.y;
    return ans;
  }

}


class Triplet {
  int x, y, gcd;

  @Override
  public String toString() {
    return "Triplet [x=" + x + ", y=" + y + ", gcd=" + gcd + "]";
  }

}
