package Climbing_Stairs_70;

public class Solution01 {
  public static int climbStairs(int n) {
    int[] dp = new int[n + 1];
    int m = 2;
    dp[0] = 1;

    for (int i = 1; i <= n; i++) { // 遍历背包
      for (int j = 1; j <= m; j++) { //遍历物品
        if (i >= j) dp[i] += dp[i - j];
      }
    }

    return dp[n];
  }
  public static void main(String args[])
  {
    int n = 3;
    System.out.println(climbStairs(n));
  }
}
