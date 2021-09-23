package Sort;

import java.util.Arrays;

public class SelectionSort {

  public int[] sortArray(int[] nums) {
    int len = nums.length;
    for (int i = 0; i < len - 1; i++) {
      int minIndex = i;
      for (int j = i + 1; j < len; j++) {
        if (nums[j] < nums[minIndex]) {
          minIndex = j;
        }
      }
      swap(nums, i, minIndex);
    }
    return nums;
  }

  private void swap(int[] nums, int index1, int index2) {
    int temp = nums[index1];
    nums[index1] = nums[index2];
    nums[index2] = temp;
  }

  public static void main(String[] args) {
    int[] nums = { 5, 2, 3, 1 };
    SelectionSort solution = new SelectionSort();
    int[] res = solution.sortArray(nums);
    System.out.println(Arrays.toString(res));
  }
}