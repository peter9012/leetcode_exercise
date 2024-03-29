package Longest_Repeating_Character_Replacement_424;

public class Solution {
  public static int characterReplacement(String s, int k) {
    int len = s.length();
    int[] count = new int[26];
    int start = 0, maxCount = 0, maxLength = 0;
    for (int end = 0; end < len; end++) {
      maxCount = Math.max(maxCount, ++count[s.charAt(end) - 'A']);
      while (end - start + 1 - maxCount > k) {
        count[s.charAt(start) - 'A']--;
        start++;
      }
      maxLength = Math.max(maxLength, end - start + 1);
    }
    return maxLength;
  }
  public static void main(String[] args) {
    String str = "AABABBA";
    int k = 2;
    System.out.println(characterReplacement(str, k));
  }
}
