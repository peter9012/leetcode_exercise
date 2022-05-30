package Find_K_Closest_Elements_658;

import java.util.*;

public class Solution {
  public static List<Integer> findClosestElements(int[] arr, int k, int x) {
    // Initialize binary search bounds
    int left = 0;
    int right = arr.length - k;

    // Binary search against the criteria described
    while (left < right) {
      int mid = (left + right) / 2;
      if (x - arr[mid] > arr[mid + k] - x) {
        left = mid + 1;
      } else {
        right = mid;
      }
    }

    // Create output in correct format
    List<Integer> result = new ArrayList<Integer>();
    for (int i = left; i < left + k; i++) {
      result.add(arr[i]);
    }

    return result;
  }

  public static void main(String args[])
  {
    int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
    int x = 4;
    int k = 3;
    System.out.println(findClosestElements(arr, k, x));
  }
}
