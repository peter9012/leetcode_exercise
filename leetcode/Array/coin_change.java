package Array;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Arrays;

public class coin_change {
  public coin_change() {
  }

  static int count(int n) {
    int[] table = new int[n + 1];
    Arrays.fill(table, 0);
    table[0] = 1;

    int i;
    for(i = 3; i <= n; ++i) {
      table[i] += table[i - 3];
    }

    for(i = 5; i <= n; ++i) {
      table[i] += table[i - 5];
    }

    for(i = 10; i <= n; ++i) {
      table[i] += table[i - 10];
    }

    return table[n];
  }

  public static void main(String[] args) {
    int n = 10;
    System.out.println("Count for " + n + " is " + count(n));
  }
}

