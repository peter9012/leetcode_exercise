package search_in_rotated_sorted_array_v2_81;

public class SearchInRotatedSortedArray {
	
	public boolean search(int[] nums, int target) {
		if(nums == null || nums.length == 0) {
			return false;
		}
		int start = 0, mid, end = nums.length - 1;
		while(start <= end) {
			mid = start + (start - end) / 2;
			if (nums[mid] == target) return true;
			if (nums[start] == nums[mid] ) {
				start++;
				continue;
			}
			// left side is sorted
			if(nums[start] < nums[mid]) {
				// target is in the left side
				 if (nums[mid] > target && nums[start] <= target) {
					 end = mid - 1;
				 }
				 else {
					 start = mid + 1;
				 }
			}
			// right side is sorted
			// target is in the right side
			else {
				 if (nums[mid] < target && nums[end] >= target) {
					 start = mid + 1;
				 }
				 else {
					 end = mid - 1;
				 }
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
