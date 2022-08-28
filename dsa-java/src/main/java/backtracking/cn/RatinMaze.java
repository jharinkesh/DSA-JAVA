package main.java.backtracking.cn;

// https://www.techiedelight.com/find-shortest-path-in-maze/
public class RatinMaze {

  public static void main(String[] args) {
    int[][] A = {{1, 0, 1}, {1, 1, 1}, {1, 1, 1}};
    ratInAMaze(A);
  }

  public static void ratInAMaze(int maze[][]) {
    int n = maze.length;
    solve(maze, new int[n][n], n, 0, 0);
  }

  public static void solve(int[][] maze, int[][] paths, int n, int i, int j) {
    if (i == n - 1 && j == n - 1) {
      paths[i][j] = 1;
      printSol(paths);
      return;
    }

    if (i >= 0 && i < n && j >= 0 && j < n && paths[i][j] == 0 && maze[i][j] == 1) {
      paths[i][j] = 1;
      // left turn
      solve(maze, paths, n, i, j - 1);
      // right turn
      solve(maze, paths, n, i, j + 1);
      // up turn
      solve(maze, paths, n, i - 1, j);
      // down turn
      solve(maze, paths, n, i + 1, j);
      paths[i][j] = 0;
    }
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
