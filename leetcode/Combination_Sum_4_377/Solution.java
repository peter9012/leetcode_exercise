package Combination_Sum_4_377;

import java.util.HashMap;

public class Solution {
  private static HashMap<Integer, Integer> memo;

  public static int combinationSum4(int[] nums, int target) {
    // minor optimization
    // Arrays.sort(nums);
    memo = new HashMap<>();
    return combs(nums, target);
  }

  private static int combs(int[] nums, int remain) {
    if (remain == 0)
      return 1;
    if (memo.containsKey(remain))
      return memo.get(remain);

    int result = 0;
    for (int num : nums) {
      if (remain - num >= 0)
        result += combs(nums, remain - num);
      // minor optimizaton, early stopping
      // else
      //     break;
    }
    memo.put(remain, result);
    return result;
  }

  public static void main(String[] args)
  {
    int[] arr = {1, 2, 3};
    int target = 4;
    System.out.println(combinationSum4(arr,target));
  }
}
