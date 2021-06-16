package Array;

public class rotate_array_189 {
  public static void rotateArray(int[] nums, int k) {
    k %= nums.length;
    int temp, previous;
    for (int i = 0; i < k; i++) {
      previous = nums[nums.length - 1];
      for (int j = 0; j < nums.length; j++) {
        temp = nums[j];
        nums[j] = previous;
        previous = temp;
      }
    }
  }

  static void printArray(int arr[])
  {
      for ( int i = 0; i < arr.length ; i++)
          System.out.print(arr[i] + " ");
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
    rotateArray(arr, 3);
    printArray(arr);
  }
}