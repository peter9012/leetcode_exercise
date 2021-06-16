package Hash;

import java.util.HashSet;

public class Check_pair_with_sum_in_array {
  static void printpairs(int arr[], int sum) {
    HashSet<Integer> s = new HashSet<Integer>();
    int temp = 0;
    for (int i = 0; i < arr.length; i++) {
      temp = sum - arr[i];
      if (s.contains(temp)) {
        System.out.println("Pair with given sum "
        + sum + " is (" + arr[i]
        + ", " + temp + ")");
      }
      s.add(arr[i]);
    }
  }

  public static void main(String[] args)
    {
        int A[] = { 1, 4, 45, 6, 10, 8 };
        int n = 9;
        printpairs(A, n);
    }
}