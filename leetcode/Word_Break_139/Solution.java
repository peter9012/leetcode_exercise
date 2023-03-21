package Word_Break_139;

import java.util.*;

public class Solution {
  public static boolean wordBreak(String s, List<String> wordDict) {
    HashSet<String> set = new HashSet<>(wordDict);
    boolean[] valid = new boolean[s.length() + 1];
    valid[0] = true;

    for (int i = 1; i <= s.length(); i++) {
      for (int j = 0; j < i && !valid[i]; j++) {
        if (set.contains(s.substring(j, i)) && valid[j]) {
          valid[i] = true;
        }
      }
    }

    return valid[s.length()];
  }
  public static void main(String args[])
  {
    String s = "applepenapple";
    String[] wordDict = {"apple","pen"};
    System.out.println(wordBreak(s, Arrays.asList(wordDict)));
  }
}
