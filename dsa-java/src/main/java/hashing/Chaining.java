package main.java.hashing;

import java.util.LinkedList;

public class Chaining {

  public static void main(String[] args) {
    ChainTable table = new ChainTable(11);
    table.insert(235);
    table.insert(333);
    table.insert(5);
    table.insert(47);
    table.insert(39);
    table.disp();
  }
}


class ChainTable {
  final int SIZE;
  LinkedList<Integer>[] table;

  ChainTable(int size) {
    this.SIZE = size;
    this.table = new LinkedList[this.SIZE];
    for (int i = 0; i < this.SIZE; i++) {
      table[i] = new LinkedList<>();
    }
  }

  int hash(Integer key) {
    return key % SIZE;
  }

  void insert(Integer key) {
    int h = hash(key);
    table[h].add(key);
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
    System.out.println(" -- Hash table --");
    for (int i = 0; i < SIZE; i++) {
      System.out.println(i + " : " + table[i].toString());
    }
  }
}

