package Climbing_Stairs_70;

public class climb_stairs {
  // Brute Force
  // public int climbStairs(int n) {
  //     int memo[] = new int[n + 1];
  //     return climb_Stairs(0, n, memo);
  // }
  // public int climb_Stairs(int i, int n, int memo[]) {
  //     if (i > n) {
  //         return 0;
  //     }
  //     if (i == n) {
  //         return 1;
  //     }
  //     if (memo[i] > 0) {
  //         return memo[i];
  //     }
  //     memo[i] = climb_Stairs(i + 1, n, memo) + climb_Stairs(i + 2, n, memo);
  //     return memo[i];
  // }

  // Recursion
  // public int climbStairs(int n) {
  //   int memo[] = new int[n+1];
  //   return climb_Stairs(0, n, memo);
  // }
  // public int climb_Stairs(int i, int n, int memo[]){
  //   if (i > n) {
  //     return 0;
  //   }
  //   if (i == n) {
  //     return 1;
  //   }
  //   if (memo[i] > 0) {
  //     return memo[i];
  //   }
  //   memo[i] =  climb_Stairs(i+1, n, memo) + climb_Stairs(i+2, n, memo);
  //   return memo[i];
  // }

  //  top-down implementation
//  private HashMap<Integer, Integer> memo = new HashMap<>();
//  private int dp(int i){
//    if (i <= 2) return i;
//    if (!memo.containsKey(i)) {
//      memo.put(i, dp(i-1)+ dp(i-2));
//    }
//    return memo.get(i);
//  }
//  public int climbStairs(int n) {
//    return dp(n);
//  }

  // Dynamic Programming
//  public int climbStairs(int n) {
//    if(n == 1) {
//      return 1;
//    }
//    int[] dp = new int[n+1];
//    dp[1] = 1;
//    dp[2] = 2;
//    for (int i = 3; i <= n; i++) {
//      dp[i] = dp[i - 1] + dp[i - 2];
//    }
//  return dp[n];
//  }
}