package Bulls_and_Cows_299;

import java.util.*;

public class Solution {
  public static String getHint(String secret, String guess) {
    HashMap<Character, Integer> h = new HashMap();
    for (char s : secret.toCharArray()) {
      h.put(s, h.getOrDefault(s, 0) + 1);
    }

    int bulls = 0, cows = 0;
    int n = guess.length();
    for (int idx = 0; idx < n; ++idx) {
      char ch = guess.charAt(idx);
      if (h.containsKey(ch)) {
        // corresponding characters match
        if (ch == secret.charAt(idx)) {
          // update the bulls
          bulls++;
          // update the cows
          // if all ch characters from secret
          // were used up
          if (h.get(ch) <= 0)
            cows--;
          // corresponding characters don't match
        } else {
          // update the cows
          if (h.get(ch) > 0)
            cows++;
        }
        // ch character was used
        h.put(ch, h.get(ch) - 1);
      }
    }

    return Integer.toString(bulls) + "A" + Integer.toString(cows) + "B";
  }

  public static void main(String[] args)
  {
    String secret = "1807";
    String guess = "7810";
    System.out.println(getHint(secret, guess));
  }
}
