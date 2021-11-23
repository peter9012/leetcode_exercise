package House_Robber_198;

import java.util.HashMap;

public class Solution {
  private static final HashMap<Integer, Integer> memo = new HashMap<>();
  private static int[] nums;

  private static int dp(int i) {
    if (i == 0) return nums[0];
    if (i == 1) return Math.max(nums[0], nums[1]);
    if (!memo.containsKey(i)) {
      memo.put(i, Math.max(dp(i-1),dp(i-2)+nums[i]));
    }
    return memo.get(i);
  }

  public static int rob(int[] nums) {
    Solution.nums = nums;
    return dp(Solution.nums.length - 1);
  }

  public static void main(String[] args)
  {
    int[] arr = {1, 2, 3, 1};
    System.out.println(rob(arr));
  }

}
