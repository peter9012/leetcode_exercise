package Running_Sum_of_1d_Array_1480;

import java.util.Arrays;

public class Solution {
  public static int[] runningSum(int[] nums) {
    for (int i = 1; i < nums.length; i++) {
      // Result at index `i` is sum of result at `i-1` and element at `i`.
      nums[i] += nums[i - 1];
    }
    return nums;
  }
  public static void main(String[] args) {
    int[] nums = {1,2,3,4};
    System.out.println(Arrays.toString(runningSum(nums)));
  }
}
