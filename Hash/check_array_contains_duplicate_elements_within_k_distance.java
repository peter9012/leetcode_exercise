package Hash;

import java.util.*;

public class check_array_contains_duplicate_elements_within_k_distance {
  static boolean checkDuplicatesWithinK(int arr[], int k) {
    HashSet<Integer> set = new HashSet<>();

    for (int i = 0; i < arr.length; i++) {

      if(set.contains(arr[i]))
        return true;

      set.add(arr[i]);
      
      if(i >= k)
        set.remove(arr[i-k]);
    }
    return false;
  }

  public static void main (String[] args)
    {
        int arr[] = {10, 5, 3, 4, 3, 5, 6};
        if (checkDuplicatesWithinK(arr, 3))
           System.out.println("Yes");
        else
           System.out.println("No");
    }
}