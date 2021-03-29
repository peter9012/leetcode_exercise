package Search_In_Rotated_Sorted_Array;

public class SearchRotatedSortedArray {
  public static int search(int[] nums, int target) {
    int start = 0, end = nums.length - 1;
    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (nums[mid] == target) return mid;
      else if (nums[mid] >= nums[start]) {
        if (target >= nums[start] && target < nums[mid]) end = mid - 1;
        else start = mid + 1;
      }
      else {
        if (target <= nums[end] && target > nums[mid]) start = mid + 1;
        else end = mid - 1;
      }
    }
    return -1;
  }
  
  public static void main(String args[]) {
  	int arr[] = { 4, 5, 6, 7, 8, 9, 1, 2, 3 };
    int i = search(arr, 2);
    if (i != -1)
        System.out.println("Index: " + i);
    else
        System.out.println("Key not found");
  }
}
