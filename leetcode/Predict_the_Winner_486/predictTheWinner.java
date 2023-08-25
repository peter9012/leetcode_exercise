package Predict_the_Winner_486;

public class predictTheWinner {
  public boolean predictTheWinner(int[] nums) {
    return canWin(nums, 0, nums.length - 1) >= 0;
  }
  private int canWin(int[] nums, int start, int end) {
    if (start == end) {
      return nums[start];
    }

    int chooseStart = nums[start] - canWin(nums, start + 1, end);
    int chooseEnd = nums[end] - canWin(nums, start, end - 1);

    return Math.max(chooseStart, chooseEnd);
  }

  public static void main(String[] args) {
    predictTheWinner solution = new predictTheWinner();
    int[] nums = {1, 5, 2};
    System.out.println(solution.predictTheWinner(nums)); // Output: false
  }
}
