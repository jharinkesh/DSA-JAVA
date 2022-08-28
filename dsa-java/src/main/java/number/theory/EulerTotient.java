package number.theory;

public class EulerTotient {

  public static void main(String[] args) {
    System.out.println(eulerPhi(20));
  }

  static int eulerPhi(int n) {
    int[] phi = new int[n + 1];

    // initialize array as a[i] = i
    for (int i = 0; i <= n; i++) {
      phi[i] = i;
    }

    for (int i = 2; i <= n; i++) {
      if (phi[i] == i) {
        phi[i] = i - 1;
        for (int j = i * 2; j <= n; j = j + i) {
          phi[j] = (phi[j] * (i - 1)) / i;
        }
      }
    }

    return phi[n];
  }

}
