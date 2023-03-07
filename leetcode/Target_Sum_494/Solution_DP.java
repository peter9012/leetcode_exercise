package Target_Sum_494;

public class Solution_DP {
  public static int findTargetSumWays(int[] nums, int target) {
    int sum = 0;
    for (int i = 0; i < nums.length; i++) sum += nums[i];
    //如果target过大 sum将无法满足
    if ( target < 0 && sum < -target) return 0;
    if ((target + sum) % 2 != 0) return 0;
    int size = (target + sum) / 2;
    if(size < 0) size = -size;
    int[] dp = new int[size + 1];
    dp[0] = 1;
    for (int i = 0; i < nums.length; i++) {
      for (int j = size; j >= nums[i]; j--) {
        dp[j] += dp[j - nums[i]];
      }
    }
    return dp[size];
  }
  static public void main (String[] args)
  {
    int []nums = {1,1,1,1,1};
    int target = 3;
    int res = findTargetSumWays(nums, target);
    System.out.println(res);
  }
}
