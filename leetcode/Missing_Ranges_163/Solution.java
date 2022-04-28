package Missing_Ranges_163;

import java.util.*;

public class Solution {
  public static List<String> findMissingRanges(int[] nums, int lower, int upper) {
    List<String> result = new ArrayList<>();
    int prev = lower - 1;
    for (int i = 0; i <= nums.length; i++) {
      int curr = (i < nums.length) ? nums[i] : upper + 1;
      if (prev + 1 <= curr - 1) {
        result.add(formatRange(prev + 1, curr - 1));
      }
      prev = curr;
    }
    return result;
  }

  private static String formatRange(int lower, int upper) {
    if (lower == upper) {
      return String.valueOf(lower);
    }
    return lower + "->" + upper;
  }

  public static void main(String[] args)
  {
    int[] arr = {0, 1, 3, 50, 75};
    int lower = 0;
    int upper = 99;
    System.out.println(findMissingRanges(arr, lower, upper));
  }
}
