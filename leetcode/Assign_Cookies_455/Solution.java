package Assign_Cookies_455;

import java.util.Arrays;

public class Solution {
  public static int findContentChildren(int[] g, int[] s) {
    Arrays.sort(g);
    Arrays.sort(s);
    int start = 0;
    int count = 0;
    for (int i = 0; i < s.length && start < g.length; i++) {
      if (s[i] >= g[start]) {
        start++;
        count++;
      }
    }
    return count;
  }
  public static void main(String[] args) {
    int g[] = {1,2}, s[] = {1,2,3};
    System.out.println(findContentChildren(g,s));
  }
}
