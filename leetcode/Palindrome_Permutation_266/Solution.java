package Palindrome_Permutation_266;

import java.util.*;

public class Solution {
  static boolean canPermutePalindrome(String s) {
    HashMap< Character, Integer > map = new HashMap < > ();
    for (int i = 0; i < s.length(); i++) {
      map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
    }
    int count = 0;
    for (char key: map.keySet()) {
      count += map.get(key) % 2;
    }
    return count <= 1;
  }
  public static void main(String[] args)
  {
    String input = "code";
    System.out.println(
            "Given a string " + input
            + " check permutation of the string could form a palindrome "
            + canPermutePalindrome(input)
    );
    String input02 = "aab";
    System.out.println(
            "Given a string " + input02
                    + " check permutation of the string could form a palindrome "
                    + canPermutePalindrome(input02)
    );
  }
}
