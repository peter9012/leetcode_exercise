package Sliding_Window;

import java.util.*;

public class No_Repeat_Substring {
  public static int findLength(String str) {
    int windowStart = 0, maxLength = 0;
    Map<Character, Integer> charIndexMap = new HashMap<>();
    for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
      char rightChar = str.charAt(windowEnd);
      if (charIndexMap.containsKey(rightChar)) {
        // this is tricky; in the current window, we will not have any 'rightChar' after its previous index
        // and if 'windowStart' is already ahead of the last index of 'rightChar', we'll keep 'windowStart'
        windowStart = Math.max(windowStart, charIndexMap.get(rightChar) + 1);
      }
      charIndexMap.put(rightChar, windowEnd); // insert the 'rightChar' into the map
      maxLength = Math.max(maxLength, windowEnd - windowStart + 1); // remember the maximum length so far
    }
    return maxLength;
  }


  public static void main(String[] args) {
    System.out.println("Length of the longest substring: " + No_Repeat_Substring.findLength("aabccbb"));
    // System.out.println("Length of the longest substring: " + No_Repeat_Substring.findLength("abbbb"));
    // System.out.println("Length of the longest substring: " + No_Repeat_Substring.findLength("abccde"));
  }

}

