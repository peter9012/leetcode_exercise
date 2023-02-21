package Find_Index_of_the_First_Occurrence_in_String_28;

public class Solution {
  public int strStr(String haystack, String needle) {
    int m = needle.length();
    int n = haystack.length();

    for (int windowStart = 0; windowStart <= n - m; windowStart++) {
      for (int i = 0; i < m; i++) {
        if (needle.charAt(i) != haystack.charAt(windowStart + i)) {
          break;
        }
        if (i == m - 1) {
          return windowStart;
        }
      }
    }

    return -1;
  }
}
