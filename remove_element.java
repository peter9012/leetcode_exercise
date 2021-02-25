public class remove_element {
  // Time complexity : O(n) Space complexity : O(1) 
  // Approach 1: Two Pointers
  // public int removeElement(int[] nums, int val) {
  //   int i = 0;
  //   for(int j = 0;j < nums.length; j++) {
  //     if(nums[j] != val) {
  //       nums[i] = nums[j];
  //       i++;
  //     }
  //   }
  //   return i;
  // }

  // Approach 2: Two Pointers - when elements to remove are rare
  // When we encounter nums[i] = valnums[i]=val, we can swap the current element out with the last element and dispose the last one. This essentially reduces the array's size by 1.
  public int removeElement(int[] nums, int val) {
    int i = 0;
    int n = nums.length;
    while (i < n) {
      if (nums[i] == val) {
        nums[i] = nums[n-1];
        n--;
      } else {
        i++;
      }
    }
    return n;
  }
}