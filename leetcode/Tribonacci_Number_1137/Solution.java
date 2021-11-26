package Tribonacci_Number_1137;

class Tri {
  private int n = 38;
  public int[] nums = new int[n];

  int helper(int k) {
    if (k == 0) return 0;
    if (nums[k] != 0) return nums[k];

    nums[k] = helper(k-1) + helper(k-2) + helper(k-3);
    return nums[k];
  }

  Tri() {
    nums[1] = 1;
    nums[2] = 1;
    helper(n-1);
  }
}
public class Solution {
  public static Tri t = new Tri();
  public static int tribonacci(int n) {
    return t.nums[n];
  }

  public static void main(String[] args)
  {
    int n = 4;
    System.out.println(tribonacci(n));
  }
}
