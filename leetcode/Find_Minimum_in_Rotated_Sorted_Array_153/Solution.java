package Find_Minimum_in_Rotated_Sorted_Array_153;

public class Solution {
  public static int findMin(int[] nums) {
    if (nums.length == 1) {
      return nums[0];
    }

    int left = 0, right = nums.length - 1;

    if (nums[right] > nums[0]) {
      return nums[0];
    }

    while (right >= left) {
      // Find the mid element
      int mid = left + (right - left) / 2;

      // if the mid element is greater than its next element then mid+1 element is the smallest
      // This point would be the point of change. From higher to lower value.
      if (nums[mid] > nums[mid + 1]) {
        return nums[mid + 1];
      }

      // if the mid element is lesser than its previous element then mid element is the smallest
      if (nums[mid - 1] > nums[mid]) {
        return nums[mid];
      }

      // if the mid elements value is greater than the 0th element this means
      // the least value is still somewhere to the right as we are still dealing with elements
      // greater than nums[0]
      if (nums[mid] > nums[0]) {
        left = mid + 1;
      } else {
        // if nums[0] is greater than the mid value then this means the smallest value is somewhere to
        // the left
        right = mid - 1;
      }
    }
    return -1;
  }
  public static void main(String args[])
  {
    int arr[] = {4, 5, 6, 7, 0, 1, 2};
    System.out.println(findMin(arr));
  }
}
