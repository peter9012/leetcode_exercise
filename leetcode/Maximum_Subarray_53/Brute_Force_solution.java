package Maximum_Subarray_53;

public class Brute_Force_solution {
  public static int maxSubArray(int[] nums) {
    int maxSubarray = Integer.MIN_VALUE;
    for (int i = 0; i < nums.length; i++) {
      int currentSubarray = 0;
      for (int j = i; j < nums.length; j++) {
        currentSubarray += nums[j];
        maxSubarray = Math.max(maxSubarray, currentSubarray);
      }
    }
    return maxSubarray;
  }

  public static void main(String[] args)
  {
    int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    System.out.println(maxSubArray(arr));
  }
}
