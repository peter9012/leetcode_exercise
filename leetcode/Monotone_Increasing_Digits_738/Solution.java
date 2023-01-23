package Monotone_Increasing_Digits_738;

public class Solution {
  public static int monotoneIncreasingDigits(int n) {
    String s = String.valueOf(n);
    char[] chars = s.toCharArray();
    int start = s.length();
    for (int i = s.length() - 2; i >= 0; i--) {
      if (chars[i] > chars[i + 1]) {
        chars[i]--;
        start = i+1;
      }
    }
    for (int i = start; i < s.length(); i++) {
      chars[i] = '9';
    }
    return Integer.parseInt(String.valueOf(chars));
  }
  public static void main(String[] args)
  {
    int n = 332;
    System.out.println(monotoneIncreasingDigits(n));
  }
}
