package main.java.arrays.matrix;

public class Daigonal {

  public static void main(String[] args) {
    int[][] a = {{2, 0, 0, 0}, {0, 3, 0, 0}, {0, 0, 9, 0}, {0, 0, 0, 4}};
    DiMatrix mat = new DiMatrix(a.length);
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[0].length; j++) {
        mat.set(i, j, a[i][j]);
      }
    }
    mat.disp();
  }

}


class DiMatrix {
  int[] data;

  public DiMatrix(int size) {
    data = new int[size];
  }

  public void set(int i, int j, int e) {
    if (i == j)
      data[i] = e;
  }

  public int get(int i, int j) {
    if (i == j)
      return data[i];
    return 0;
  }

  public void disp() {
    for (int i = 0; i < data.length; i++) {
      System.out.println();
      for (int j = 0; j < data.length; j++) {
        System.out.print(get(i, j) + " ");
      }
    }
  }
}
