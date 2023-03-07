package Maximum_Subarray_Sum_After_One_Operation_1746;

public class Solution {
  public static int maxSumAfterOperation(int[] nums) {
    int n = nums.length;
    int[][] dp = new int[n][2];
    dp[0][0] = nums[0]; dp[0][1] = nums[0] * nums[0];
    int res = dp[0][1];
    for(int i = 1; i < n; i++) {
      dp[i][0] = Math.max(dp[i - 1][0] + nums[i], nums[i]);
      dp[i][1] = Math.max(nums[i] * nums[i], Math.max(dp[i - 1][1] + nums[i], dp[i - 1][0] + nums[i] * nums[i]));
      res = Math.max(res, dp[i][1]);
    }
    return res;
  }
  public static void main(String[] args)
  {
    int[] arr = {2,-1,-4,-3};
    System.out.println(maxSumAfterOperation(arr));
  }
}
