package Intersection_of_Two_Arrays_349;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
  public static int[] intersection(int[] nums1, int[] nums2) {
    if (nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0) {
      return new int[0];
    }
    Set<Integer> set1 = new HashSet<>();
    Set<Integer> resSet = new HashSet<>();
    //遍历数组1
    for (int i : nums1) {
      set1.add(i);
    }
    //遍历数组2的过程中判断哈希表中是否存在该元素
    for (int i : nums2) {
      if (set1.contains(i)) {
        resSet.add(i);
      }
    }
    //将结果几何转为数组
    return resSet.stream().mapToInt(x -> x).toArray();
  }

  public static void main(String args[])
  {
    int nums1[] = { 4, 9, 5 };
    int nums2[] = { 9, 4, 9, 8, 4 };

    System.out.println(Arrays.toString(intersection(nums1,nums2)));
  }
}
