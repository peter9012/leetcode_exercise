package Random_Pick_Index_398;

import java.io.IOException;
import java.util.*;

public class Solution {
  private HashMap<Integer, List<Integer>> indices;
  private Random rand;

  public Solution(int[] nums) {
    this.rand = new Random();
    this.indices = new HashMap<Integer, List<Integer>>();
    int l = nums.length;
    for (int i = 0; i < l; ++i) {
      if (!this.indices.containsKey(nums[i])) {
        this.indices.put(nums[i], new ArrayList<>());
      }
      this.indices.get(nums[i]).add(i);
    }
  }

  public int pick(int target) {
    int l = indices.get(target).size();
    // pick an index at random
    int randomIndex = indices.get(target).get(rand.nextInt(l));
    return randomIndex;
  }

  public static void main(String[] args) throws IOException {
    int[] nums = new int[] {1,2,3,3,3};
    Solution solution = new Solution(nums);
    System.out.println(solution.pick(3));
    System.out.println(solution.pick(1));
    System.out.println(solution.pick(3));
  }
}
