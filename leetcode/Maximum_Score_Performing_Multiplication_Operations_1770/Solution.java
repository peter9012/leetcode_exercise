package Maximum_Score_Performing_Multiplication_Operations_1770;

public class Solution {
  private int[][] memo;
  private int[] nums, multipliers;
  private int n, m;

  private int dp(int i, int left) {
    if (i == m) {
      return 0; // Base case
    }

    int mult = multipliers[i];
    int right = n - 1 - (i - left);

    if (memo[i][left] == 0) {
      // Recurrence relation
      memo[i][left] = Math.max(mult * nums[left] + dp(i + 1, left + 1),
              mult * nums[right] + dp(i + 1, left));
    }

    return memo[i][left];
  }

  public int maximumScore(int[] nums, int[] multipliers) {
    n = nums.length;
    m = multipliers.length;
    this.nums = nums;
    this.multipliers = multipliers;
    this.memo = new int[m][m];
    return dp(0, 0);
  }
}
