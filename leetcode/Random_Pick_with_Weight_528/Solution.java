package Random_Pick_with_Weight_528;

import java.io.IOException;

public class Solution {
  private int[] prefixSums;
  private int totalSum;

  public Solution(int[] w) {
    this.prefixSums = new int[w.length];

    int prefixSum = 0;
    for (int i = 0; i < w.length; ++i) {
      prefixSum += w[i];
      this.prefixSums[i] = prefixSum;
    }
    this.totalSum = prefixSum;
  }

  public int pickIndex() {
    double target = this.totalSum * Math.random();
    int i = 0;
    // run a linear search to find the target zone
    for (; i < this.prefixSums.length; ++i) {
      if (target < this.prefixSums[i])
        return i;
    }
    // to have a return statement, though this should never happen.
    return i - 1;
  }

  public static void main(String[] args) throws IOException {
    int[] w = {1,3};
    Solution obj = new Solution(w);
    int param_1 = obj.pickIndex();
    System.out.println(param_1);
    int param_2 = obj.pickIndex();
    System.out.println(param_2);
    int param_3 = obj.pickIndex();
    System.out.println(param_3);
    int param_4 = obj.pickIndex();
    System.out.println(param_4);
  }
}
