package dypro;

public class SubsetSum {

  public static void main(String[] args) {
    System.out.print(subsetSum(new int[] {1, 3, 5, 7, 9}, 8));
  }

  static boolean subsetSum(int[] a, int sum) {
    int n = a.length;
    boolean[][] dp = new boolean[n + 1][sum + 1];
    for (int i = 0; i <= n; i++) {
      dp[i][0] = true;
    }

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= sum; j++) {
        dp[i][j] = dp[i - 1][j];
        if (j >= a[i - 1]) {
          dp[i][j] = dp[i][j] || dp[i - 1][j - a[i - 1]];
        }
      }
    }
    return dp[n][sum];
  }


}
