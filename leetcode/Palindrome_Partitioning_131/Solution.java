package Palindrome_Partitioning_131;

import java.util.*;

public class Solution {
  public static List<List<String>> partition(String s) {
    List<List<String>> result = new ArrayList<List<String>>();
    dfs(0, result, new ArrayList<String>(), s);
    return result;
  }

  static void dfs(int start, List<List<String>> result, List<String> currentList, String s) {
    if (start >= s.length()) result.add(new ArrayList<String>(currentList));
    for (int end = start; end < s.length(); end++) {
      if (isPalindrome(s, start, end)) {
        // add current substring in the currentList
        currentList.add(s.substring(start, end + 1));
        dfs(end + 1, result, currentList, s);
        // backtrack and remove the current substring from currentList
        currentList.remove(currentList.size() - 1);
      }
    }
  }

  static boolean isPalindrome(String s, int low, int high) {
    while (low < high) {
      if (s.charAt(low++) != s.charAt(high--)) return false;
    }
    return true;
  }

  public static void main(String[] args)
  {
    String input = "nitin";

    System.out.println("All possible palindrome" +
            "partitions for " + input
            + " are :");

    for (List<String> list : partition(input)) {
      System.out.print(list + " ");
    }
  }
}
