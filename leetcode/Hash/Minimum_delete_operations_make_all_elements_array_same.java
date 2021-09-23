package Hash;

import java.util.HashMap;
import java.util.Map;

public class Minimum_delete_operations_make_all_elements_array_same {
  static int minDelete(int arr[], int n) {
    HashMap<Integer, Integer> freq = new HashMap<>();
    for(int i = 0; i < n; i++)
    freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);

    int max_freq = Integer.MIN_VALUE;
    for(Map.Entry<Integer, Integer> entry : freq.entrySet())
        max_freq = Math.max(max_freq, entry.getValue());

    return n - max_freq ;
  }

  public static void main(String[] args)
  {
    int arr[] = { 4, 3, 4, 4, 2, 4 };
    int n = arr.length;
     
    System.out.println(minDelete(arr, n));
  }
}