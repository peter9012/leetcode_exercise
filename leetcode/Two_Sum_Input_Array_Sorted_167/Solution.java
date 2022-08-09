package Two_Sum_Input_Array_Sorted_167;

import java.util.Arrays;

public class Solution {
  public static int[] twoSum(int[] num, int target) {
    int[] indice = new int[2];
    if (num == null || num.length < 2) return indice;
    int left = 0, right = num.length - 1;
    while (left < right) {
      int v = num[left] + num[right];
      if (v == target) {
        indice[0] = left + 1;
        indice[1] = right + 1;
        break;
      } else if (v > target) {
        right --;
      } else {
        left ++;
      }
    }
    return indice;
  }
  public static void main(String[] args)
  {
    int[] numbers = { 2, 7, 11, 15};
    System.out.println(Arrays.toString(twoSum(numbers,9)));
  }
}
