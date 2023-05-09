package Decode_Ways_91;

public class Solution_iterative {
  public static int numDecodings(String s) {
    // DP array to store the subproblem results
    int[] dp = new int[s.length() + 1];
    dp[0] = 1;

    // Ways to decode a string of size 1 is 1. Unless the string is '0'.
    // '0' doesn't have a single digit decode.
    dp[1] = s.charAt(0) == '0' ? 0 : 1;

    for (int i = 2; i < dp.length; i++) {
      // Check if successful single digit decode is possible.
      if (s.charAt(i - 1) != '0') {
        dp[i] = dp[i - 1];
      }

      // Check if successful two digit decode is possible.
      int twoDigit = Integer.valueOf(s.substring(i - 2, i));
      if (twoDigit >= 10 && twoDigit <= 26) {
        dp[i] += dp[i - 2];
      }
    }
    return dp[s.length()];
  }

  public int numDecodings_space(String s) {
    if (s.charAt(0) == '0') {
        return 0;
    }

    int n = s.length();
    int twoBack = 1;
    int oneBack = 1;
    for (int i = 1; i < n; i++) {
        int current = 0;
        if (s.charAt(i) != '0') {
            current = oneBack;
        }
        int twoDigit = Integer.parseInt(s.substring(i - 1, i + 1));
        if (twoDigit >= 10 && twoDigit <= 26) {
            current += twoBack;
        }

        twoBack = oneBack;
        oneBack = current;
    }
    return oneBack;
  }
    public static void main(String[] args)
  {
    String str = "226";
    System.out.printf("Count is %d", numDecodings(str));
  }
}
