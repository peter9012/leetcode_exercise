package Check_Permutation_1_2;

public class Solution {


  static boolean arePermutation(String s, String t) {

    if (s.length() != t.length()) {
      return false;
    }
    int[] letters = new int[128];
    char[] s_array = s.toCharArray();
    for (char c : s_array) {
      letters[c]++;
    }
    for (int i= 0; i < t.length(); i++) {
      int c = (int) t.charAt(i);
      letters[c]--;
      if (letters[c] < 0) {
        return false;
      }
    }
    return true;
  }

  public static void main(String args[])
  {
    String s = "geeksforgeeks";
    String t = "forgeeksgeeks";

    if ( arePermutation(s, t) )
      System.out.println("Yes");
    else
      System.out.println("No");
  }
}
