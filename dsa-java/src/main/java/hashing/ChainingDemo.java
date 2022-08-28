package hashing;

import java.util.LinkedList;

public class ChainingDemo {

  public static void main(String[] args) {
    MyHash hash = new MyHash(7);
    hash.insert(24).insert(21).insert(28).insert(83).insert(93).insert(40).insert(75);
    hash.disp();
    // System.out.println(hash.search(93));
    // System.out.println(hash.search(94));
    hash.remove(28);
    hash.disp();
  }
}


class MyHash {
  final int SIZE;
  LinkedList<Integer>[] table;

  MyHash(int size) {
    SIZE = size;
    table = new LinkedList[SIZE];
    for (int i = 0; i < SIZE; i++)
      table[i] = new LinkedList<Integer>();
  }

  int hash(Integer key) {
    return key % SIZE;
  }

  MyHash insert(Integer key) {
    int h = hash(key);
    table[h].add(key);
    return this;
  }

  void remove(Integer key) {
    int h = hash(key);
    table[h].remove(key);
  }

  boolean search(Integer key) {
    int h = hash(key);
    return table[h].contains(key);
  }

  void disp() {
    System.out.println("\n -- hash table --");
    for (int i = 0; i < SIZE; i++) {
      System.out.println(i + " : " + table[i].toString());
    }
  }
}
