package backtracking;

public class NQueens {

  public static void main(String[] args) {
    int n = 4;
    int[][] a = new int[n][n];
    solve(a, 0);
    // print(a);
  }

  private static void solve(int[][] a, int row) {
    if (row >= a.length) {
      print(a);
    }

    for (int col = 0; col < a.length; col++) {
      if (isSafe(a, row, col)) {
        a[row][col] = 1;
        solve(a, row + 1);
        if (row == a.length - 1)
          break;
        a[row][col] = 0;
      }
    }
  }

  private static boolean isSafe(int[][] a, int cRow, int cCol) {

    for (int row = 0; row < a.length; row++) {
      if (a[row][cCol] == 1)
        return false;
    }

    for (int i = cRow, j = cCol; i < a.length && j < a.length; i++, j++) {
      if (a[i][j] == 1)
        return false;
    }

    for (int i = cRow, j = cCol; i < a.length && j >= 0; i++, j--) {
      if (a[i][j] == 1)
        return false;
    }

    for (int i = cRow, j = cCol; i >= 0 && j < a.length; i--, j++) {
      if (a[i][j] == 1)
        return false;
    }

    for (int i = cRow, j = cCol; i >= 0 && j >= 0; i--, j--) {
      if (a[i][j] == 1)
        return false;
    }

    return true;
  }

  private static void print(int a[][]) {
    System.out.println("----- \n");

    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a.length; j++) {
        System.out.print(a[i][j] + " ");
      }
      System.out.println();
    }
  }

}
