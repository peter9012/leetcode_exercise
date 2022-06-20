package Q10_Sort.QuickSort;

import java.util.*;

public class Solution02 {
  public static List<Integer> sortArray(int[] nums) {
    List<Integer> res = new ArrayList<>();
    if (nums == null || nums.length == 0) return res;
    quickSort(nums, 0, nums.length - 1);
    for (int i : nums) res.add(i);
    return res;
  }
  private static void quickSort(int[] nums, int l, int r) {
    if (l >= r) return;
    int mid = partition(nums, l, r);
    quickSort(nums, l, mid);
    quickSort(nums, mid + 1, r);
  }
  private static int partition(int[] nums, int l, int r) {
    int pivot = nums[l];
    while (l < r) {
      while (l < r && nums[r] >= pivot) r--;
      nums[l] = nums[r];
      while (l < r && nums[l] <= pivot) l++;
      nums[r] = nums[l];
    }
    nums[l] = pivot;
    return l;
  }
  public static void main(String[] args)
  {
    int[] arr = { 10, 7, 8, 9, 1, 5 };
    System.out.println("Sorted array: ");
    System.out.println(sortArray(arr));
  }
}
