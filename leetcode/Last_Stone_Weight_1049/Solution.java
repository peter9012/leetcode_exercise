package Last_Stone_Weight_1049;

public class Solution {
  public static int lastStoneWeightII(int[] stones) {
    int sum = 0;
    for (int i : stones) {
      sum += i;
    }
    int target = sum >> 1;
    //初始化dp数组
    int[] dp = new int[target + 1];
    for (int i = 0; i < stones.length; i++) {
      //采用倒序
      for (int j = target; j >= stones[i]; j--) {
        //两种情况，要么放，要么不放
        dp[j] = Math.max(dp[j], dp[j - stones[i]] + stones[i]);
      }
    }
    return sum - 2 * dp[target];
  }
  static public void main (String[] args)
  {
    int []stones = {2,7,4,1,8,1};
    int res = lastStoneWeightII(stones);
    System.out.println("Return the smallest possible weight of the left stone: "+ res);
  }
}
