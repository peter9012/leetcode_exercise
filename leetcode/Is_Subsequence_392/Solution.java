package Is_Subsequence_392;

public class Solution {
  public static boolean isSubsequence(String s, String t) {
    int leftbound = s.length(), rightbound = t.length();
    int leftPointer = 0, rightPointer = 0;
    while (leftPointer < leftbound && rightPointer < rightbound) {
      if (s.charAt(leftPointer) == t.charAt(rightPointer)) {
        leftPointer += 1;
      }
      rightPointer += 1;
    }
    return leftPointer == leftbound;
  }
  public static void main(String[] args) {
    String s  = "abc", t = "ahbgdc";
    System.out.println(isSubsequence(s,t));
  }
}
