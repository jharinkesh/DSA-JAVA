package main.java.backtracking.cn;

public class Sudoku {

  public static void main(String[] args) {
    int[][] m =
        {{3, 0, 6, 5, 0, 8, 4, 0, 0}, {5, 2, 0, 0, 0, 0, 0, 0, 0}, {0, 8, 7, 0, 0, 0, 0, 3, 1},
            {0, 0, 3, 0, 1, 0, 0, 8, 0}, {9, 0, 0, 8, 6, 3, 0, 0, 5}, {0, 5, 0, 0, 9, 0, 6, 0, 0},
            {1, 3, 0, 0, 0, 0, 2, 5, 0}, {0, 0, 0, 0, 0, 0, 0, 7, 4}, {0, 0, 5, 2, 0, 6, 3, 0, 0}};
    System.out.println(solve(m));
    printSol(m);
  }

  static boolean solve(int[][] m) {
    int n = m.length, count = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (m[i][j] == 0) {
          for (int val = 1; val < 10; val++) {
            if (isSafe(m, i, j, val)) {
              m[i][j] = val;
              if (solve(m))
                return true;
              m[i][j] = 0;
            }
          }
        } else {
          count++;
        }
      }
    }

    System.out.println("count: " + count);
    return count == n * n;
  }

  static boolean isSafe(int[][] m, int row, int col, int val) {
    int n = m.length;

    // row
    for (int j = 0; j < n; j++) {
      if (m[row][j] == val) {
        return false;
      }
    }

    // col
    for (int i = 0; i < n; i++) {
      if (m[i][col] == val) {
        return false;
      }
    }

    // top left col number
    // int colnum = (col / 3) * 3;
    // int rownum = (row / 3) * 3;
    int colnum = (col - col % 3);
    int rownum = (row - row % 3);
    // System.out.println(
    // "row: " + row + ", col: " + col + " [rownum: " + rownum + " ,colnum: " + colnum + "]");
    for (int x = rownum; x < rownum + 3; x++) {
      for (int y = colnum; y < colnum + 3; y++) {
        if (m[x][y] == val) {
          return false;
        }
      }
    }

    return true;
  }

  static void printSol(int[][] A) {
    for (int[] row : A) {
      System.out.println();
      for (int e : row) {
        System.out.print(e + " ");
      }
    }
    System.out.println();
  }
}
