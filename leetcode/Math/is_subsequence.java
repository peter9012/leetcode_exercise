package Math;

public class is_subsequence {

  static boolean isSubSequence_Greedy(String str1, String str2, int m, int n)
  {
    // Base Cases
    if (m == 0)
      return true;
    if (n == 0)
      return false;
    // If last characters of two strings are matching
    if (str1.charAt(m - 1) == str2.charAt(n - 1))
      return isSubSequence_Greedy(str1, str2, m - 1, n - 1);
    // If last characters are not matching
    return isSubSequence_Greedy(str1, str2, m, n - 1);
  }

  static boolean isSubsequence_points(String s, String t) {
    int leftBound = s.length(), rightBound = t.length();
    int pLeft = 0, pRight = 0;
    while (pLeft < leftBound && pRight < rightBound) {
      // move both pointers or just the right pointer
      if (s.charAt(pLeft) == t.charAt(pRight)) {
        pLeft += 1;
      }
      pRight += 1;
    }
    return pLeft == leftBound;
  }

  public static void main(String[] args)
  {
//    String str1 = "gksrek";
//    String str2 = "geeksforgeeks";
//    int m = str1.length();
//    int n = str2.length();
//    boolean res = isSubSequence(str1, str2, m, n);
//    if (res)
//      System.out.println("Yes");
//    else
//      System.out.println("No");
    String str1 = "gksrek";
    String str2 = "geeksforgeeks";
    boolean res = isSubsequence_points(str1, str2);
    if (res)
      System.out.println("Yes");
    else
     System.out.println("No");
  }
}
