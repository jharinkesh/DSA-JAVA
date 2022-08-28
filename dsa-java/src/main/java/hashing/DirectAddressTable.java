package main.java.hashing;

public class DirectAddressTable {


}


class DAT {
  final int[] data;
  final int SIZE;

  public DAT(int size) {
    this.SIZE = size;
    this.data = new int[SIZE];
  }

  int get(int index) {
    return data[index];
  }

  void set(int index, int value) {
    data[index] = value;
  }
}
