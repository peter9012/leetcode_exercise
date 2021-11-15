package Shuffle_an_Array_384;

import java.util.Arrays;
import java.util.Random;

class Solution {
  private int[] array;
  private int[] original;

  Random rand = new Random();

  private int randRange(int min, int max) {
    return rand.nextInt(max - min) + min;
  }

  private void swapAt(int i, int j) {
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }

  public Solution(int[] nums) {
    array = nums;
    original = nums.clone();
  }

  public int[] reset() {
    array = original;
    original = original.clone();
    return original;
  }

  public int[] shuffle() {
    for (int i = 0; i < array.length; i++) {
      swapAt(i, randRange(i, array.length));
    }
    return array;
  }

  public static void main(String[] args) {
    int[] nums = new int[] {1,2,3};
    Solution solution = new Solution(nums);
    System.out.println(Arrays.toString(solution.shuffle()));
    System.out.println(Arrays.toString(solution.reset()));
    System.out.println(Arrays.toString(solution.shuffle()));
    System.out.println(Arrays.toString(solution.reset()));
  }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */