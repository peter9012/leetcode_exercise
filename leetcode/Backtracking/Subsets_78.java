package Backtracking;

import java.util.*;

public class Subsets_78 {

  static List<List<Integer>> output = new ArrayList();
  static int n;
  static int k;

  public static void backtrack(int first, ArrayList<Integer> curr, int[] nums) {
    if (curr.size() == k) {
      output.add(new ArrayList(curr));
      return;
    }

    for (int i = first; i < n; ++i) {
      // add i into the current combination
      curr.add(nums[i]);
      // use next integers to complete the combination
      backtrack(i + 1, curr, nums);
      // backtrack
      curr.remove(curr.size() - 1);
    }
  }

  public static List<List<Integer>> subsets(int[] nums) {
    n = nums.length;
    for (k = 0; k < n + 1; ++k) {
      backtrack(0, new ArrayList<Integer>(), nums);
    }
    return output;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3 };
    System.out.println(subsets(arr));
  }
}