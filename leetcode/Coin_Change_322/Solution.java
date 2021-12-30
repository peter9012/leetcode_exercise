package Coin_Change_322;

public class Solution {
  public static int coinChange(int[] coins, int amount) {
    return recursionHelper(coins, amount);
  }

  private static int recursionHelper(int[] coins, int remain) {
    if (remain < 0) return -1;
    if (remain == 0) return 0;

    int minCount = Integer.MAX_VALUE;
    for (int coin : coins) {
      int count = recursionHelper(coins, remain - coin);
      if (count == -1) continue;
      minCount = Math.min(minCount, count + 1);
    }
    return minCount == Integer.MAX_VALUE? -1 : minCount;
  }
  public static void main(String args[])
  {
    int arr[] = {1, 2, 5};
    int amount = 11;
    System.out.println(coinChange(arr, amount));
  }
}
