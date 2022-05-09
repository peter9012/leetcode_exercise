package Largest_Number_Twice_of_Others_747;

public class Solution {
  public static int dominantIndex(int[] nums) {
    int max = -1, index = -1, second = -1;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > max) {
        second = max;
        max = nums[i];
        index = i;
      } else if (nums[i] > second)
        second = nums[i];
    }
    return second * 2 <= max ? index : -1;
  }
  public static void main(String[] args)
  {
    int[] nums = {3, 6, 1, 0};
    System.out.println(dominantIndex(nums));
  }
}
