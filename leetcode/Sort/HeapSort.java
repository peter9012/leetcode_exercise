package Sort;

import java.util.Arrays;

public class HeapSort {
  public int[] sortArray(int[] nums) {
    int len = nums.length;
    // 将数组整理成堆
    heapify(nums);

    // 循环不变量：区间 [0, i] 堆有序
    for (int i = len - 1; i >= 1;) {
      // 把堆顶元素（当前最大）交换到数组末尾
      swap(nums, 0, i);
      // 逐步减少堆有序的部分
      i--;
      // 下标 0 位置下沉操作，使得区间 [0, i] 堆有序
      siftDown(nums, 0, i);
    }
    return nums;
  }

  private void heapify(int[] nums) {
    int len = nums.length;
    // 只需要从 i = (len - 1) / 2 这个位置开始逐层下移
    for (int i = (len - 1) / 2; i >= 0; i--) {
      siftDown(nums, i, len - 1);
    }
  }

  private void siftDown(int[] nums, int k, int end) {
    while (2 * k + 1 <= end) {
      int j = 2 * k + 1;
      if (j + 1 <= end && nums[j + 1] > nums[j]) {
        j++;
      }
      if (nums[j] > nums[k]) {
        swap(nums, j, k);
      } else {
        break;
      }
      k = j;
    }
  }

  private void swap(int[] nums, int index1, int index2) {
    int temp = nums[index1];
    nums[index1] = nums[index2];
    nums[index2] = temp;
  }

  public static void main(String[] args) {
    int[] nums = { 5, 2, 3, 1, 6, 2, 1 };
    InsertSort solution = new InsertSort();
    int[] res = solution.sortArray(nums);
    System.out.println(Arrays.toString(res));
  }
}