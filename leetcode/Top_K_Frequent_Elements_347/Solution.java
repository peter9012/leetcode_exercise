package Top_K_Frequent_Elements_347;

import java.util.*;

public class Solution {
  public static int[] topKFrequent(int[] nums, int k) {
    if (nums == null || nums.length == 0 || k <= 0)
      return new int[0];
    Map<Integer, Integer> freqMap = new HashMap<>();
    for (int currNum : nums)
      freqMap.put(currNum, freqMap.getOrDefault(currNum, 0) + 1);
    List<Integer>[] buckets = new ArrayList[nums.length + 1];
    for (int key : freqMap.keySet()) {
      if (buckets[freqMap.get(key)] == null)
        buckets[freqMap.get(key)] = new ArrayList<>();
      buckets[freqMap.get(key)].add(key);
    }
    int[] result = new int[Math.min(freqMap.size(), k)];
    int resIdx = 0;
    for (int i = buckets.length - 1; i >= 0; --i) {
      if (buckets[i] == null)
        continue;
      for (int currNum : buckets[i]) {
        result[resIdx++] = currNum;
        if (resIdx == result.length) return result;
      }
    }
    return result;
  }
  public static void main(String[] args) {
    int[] nums = new int[] {1,1,1,2,2,3};
    System.out.println(Arrays.toString(topKFrequent(nums, 2)));
  }
}
