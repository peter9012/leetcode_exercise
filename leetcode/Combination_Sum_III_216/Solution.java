package Combination_Sum_III_216;

import java.util.*;

public class Solution {
  static List<List<Integer>> result = new ArrayList<>();
  static LinkedList<Integer> path = new LinkedList<>();

  public static List<List<Integer>> combinationSum3(int k, int n) {
    backTracking(n, k, 1, 0);
    return result;
  }

  private static void backTracking(int targetSum, int k, int startIndex, int sum) {
    // 减枝
    if (sum > targetSum) {
      return;
    }

    if (path.size() == k) {
      if (sum == targetSum) result.add(new ArrayList<>(path));
      return;
    }

    // 减枝 9 - (k - path.size()) + 1
    for (int i = startIndex; i <= 9 - (k - path.size()) + 1; i++) {
      path.add(i);
      sum += i;
      backTracking(targetSum, k, i + 1, sum);
      //回溯
      path.removeLast();
      //回溯
      sum -= i;
    }
  }

  public static void main(String[] args)
  {

    // given number
    int n = 9;
    int k = 3;
    List<List<Integer>> ans = combinationSum3(k, n);
    System.out.println(Arrays.toString(ans.toArray()));
  }

}
