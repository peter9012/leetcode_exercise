public class rotate_array {
  // Approach 1: Brute Force
  // public void rotate(int[] nums, int k) {
  //   k %= nums.length;
  //   int temp, previous;
  //   for(int i = 0; i < k; i++) {
  //     previous = nums[nums.length -  1];
  //     for (int j =0; j < nums.length; j++) {
  //       temp = nums[j];
  //       nums[j] = previous;
  //       previous = temp;
  //     }
  //   }
  // }

  // Approach 2: Using Extra Array
  // public void rotate(int[] nums, int k) {
  //   int[] a = new int[nums.length];
  //   for(int i = 0; i < nums.length; i++) {
  //     a[(i+k) % nums.length] = nums[i];
  //   }
  //   for(int i = 0; i < nums.length; i++) {
  //     nums[i] = a[i];
  //   }
  // }

  // Approach 3: Using Cyclic Replacements
  public void rotate(int[] nums, int k) {
    k = k % nums.length;
    int count = 0;
    for (int start = 0; count < nums.length; start++) {
      int current = start;
      int prev = nums[start];
      do {
        int next = (current + k) % nums.length;
        int temp = nums[next];
        nums[next] = prev;
        prev = temp;
        current = next;
        count++;
      } while (start != current);
    }
  }

}
