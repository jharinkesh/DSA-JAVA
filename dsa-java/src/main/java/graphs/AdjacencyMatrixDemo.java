package graphs;

import java.util.Arrays;

public class AdjacencyMatrixDemo {

  public static void main(String[] args) {
    AdjacencyMatrix mat = new AdjacencyMatrix(4);
    mat.addEdge(0, 1);
    mat.addEdge(0, 2);
    mat.addEdge(1, 2);
    mat.addEdge(2, 3);
    mat.disp();
  }
}


class AdjacencyMatrix {
  final int n;
  final int[][] m;

  AdjacencyMatrix(int n) {
    this.n = n;
    m = new int[n][n];
  }

  public void addEdge(int u, int v) {
    m[u][v] = 1;
    m[v][u] = 1;
  }

  public void removeEdge(int u, int v) {
    m[u][v] = 0;
    m[v][u] = 0;
  }

  public boolean isAdj(int u, int v) {
    return m[u][v] + m[v][u] == 2;
  }

  public void disp() {
    for (int i = 0; i < n; i++) {
      System.out.println(i + " : " + Arrays.toString(m[i]));
    }
  }


}
