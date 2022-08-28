package main.java.backtracking.cn;

// https://www.techiedelight.com/print-possible-solutions-n-queens-problem/
public class NQueens {
  public static void main(String[] args) {
    placeNQueens(8);

  }

  public static void placeNQueens(int n) {
    int[][] A = new int[n][n];
    solve(A, 0);
  }

  static void solve(int[][] A, int row) {
    if (row >= A.length)
      printSol(A);

    for (int col = 0; col < A.length; col++) {
      if (isSafe(A, row, col)) {
        A[row][col] = 1;
        solve(A, row + 1);
        A[row][col] = 0;
      }
    }

  }

  static boolean isSafe(int[][] A, int i, int j) {
    for (int row = 0; row < i; row++) {
      if (A[row][j] == 1)
        return false;
    }

    for (int row = i, col = j; row >= 0 && col >= 0; row--, col--) {
      if (A[row][col] == 1)
        return false;
    }

    for (int row = i, col = j; row >= 0 && col < A.length; row--, col++) {
      if (A[row][col] == 1)
        return false;
    }

    return true;
  }

  static void printSol(int[][] A) {
    for (int[] row : A) {
      for (int e : row) {
        System.out.print(e + " ");
      }
    }
    System.out.println();
  }
}
