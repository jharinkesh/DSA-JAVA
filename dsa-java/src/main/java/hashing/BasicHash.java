package hashing;

public class BasicHash {

  public static void main(String[] args) {
    int[] a = {235, 123, 536, 498};
    HashTable t = new HashTable();
    for (int e : a) {
      t.set(e);
    }

    t.disp();
  }
}


class HashTable {
  final int SIZE = 10;
  final int[] table = new int[SIZE];

  int hash(int key) {
    return key % SIZE;
  }

  void set(int key) {
    table[hash(key)] = key;
  }

  boolean get(int key) {
    int h = hash(key);
    return table[h] == key;
  }

  void disp() {
    System.out.println("\n -- Hash table --");
    for (int i = 0; i < SIZE; i++) {
      System.out.println(i + " : " + table[i]);
    }
  }

}
