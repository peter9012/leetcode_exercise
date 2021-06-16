package Hash;

import java.util.*;

public class Minimum_operation_make_all_elements_in_array_equal {

  public static int minOperation(int arr[]) {
    HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();

    for (int i = 0; i < arr.length; i++)
      if(hash.containsKey(arr[i]))
        hash.put(arr[i], hash.get(arr[i])+1);
      else
        hash.put(arr[i], 1);

    int max_count = 0;
    Set<Integer> s = hash.keySet();

    for (int i : s) {
      if (max_count < hash.get(i))
        max_count = hash.get(i);
    }

    return (arr.length - max_count);
  }

  public static void main(String[] args) 
    {
        int arr[] = {1, 5, 2, 1, 3, 2, 1};
        // int n = arr.length;
        System.out.println(minOperation(arr));
              
    }
}