package Perfect_Square_279;
import java.util.*;

public class perfect_square {
  public int numSquares(int n) {
    int dp[] = new int[n+1];
    Arrays.fill(dp, Integer.MAX_VALUE);

    dp[0] = 0;
    int max_square_index = (int) Math.sqrt(n) + 1;
    int square_nums[] = new int[max_square_index];

    for (int i = 1; i < max_square_index; ++i) {
      square_nums[i] = i * i;
    }

    for (int i = 1; i <= n; ++i) {
      for (int s = 1; s < max_square_index; ++s) {
        if (i < square_nums[s])
          break;
        dp[i] = Math.min(dp[i], dp[i - square_nums[s]] + 1);
      }
    }
    return dp[n];
  }
}