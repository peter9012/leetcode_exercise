package Min_Cost_Climbing_Stairs_746;

public class Solution02 {
  public static int minCostClimbingStairs(int[] cost) {
    int[] dp = new int[cost.length];
    dp[0] = cost[0];
    dp[1] = cost[1];
    for (int i = 2; i < cost.length; i++) {
      dp[i] = Math.min(dp[i - 1], dp[i - 2]) + cost[i];
    }
    //最后一步，如果是由倒数第二步爬，则最后一步的体力花费可以不用算
    return Math.min(dp[cost.length - 1], dp[cost.length - 2]);
  }
  public static void main(String[] args)
  {
    int[] arr = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
    System.out.println(minCostClimbingStairs(arr));
  }
}
