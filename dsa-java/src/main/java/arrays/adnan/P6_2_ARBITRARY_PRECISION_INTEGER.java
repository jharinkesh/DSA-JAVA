package main.java.arrays.adnan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P6_2_ARBITRARY_PRECISION_INTEGER {

  public static void main(String[] args) {
    List<Integer> a = new ArrayList<>(Arrays.asList(9, 9, 7, 9));
    update(a);
    //System.out.println(a);
  }

  static List<Integer> update(List<Integer> a) {
    int n = a.size(), c = 0, add = 1;
    for (int i = n - 1; i >= 0; i--) {
      int sum = a.get(i) + add + c;
      if (sum > 9) {
        a.set(i, sum - 10);
        c = 1;
      } else {
        a.set(i, sum);
        c = 0;
      }
      add = 0;
    }

    if (c == 1) {
      a.add(0, 1);
    }

    return a;
  }

}
