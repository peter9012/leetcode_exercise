package Single_Number_137;

import java.util.*;

class Solution {
  public static int singleNumber(int[] nums) {
    Set<Long> set = new HashSet<>();
    long sumSet = 0, sumArray = 0;
    for(int n : nums) {
      sumArray += n;
      set.add((long)n);
    }
    for(Long s : set) sumSet += s;
    return (int)((3 * sumSet - sumArray) / 2);
  }

  public static void main(String[] args) {
    int[] n = {2,2,3,2};
    System.out.println(singleNumber(n));
  }
}
