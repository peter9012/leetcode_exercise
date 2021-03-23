import java.util.HashMap;

public class palindrome_permutation {
  // public boolean canPermutePalindrome(String s) {
  //   HashMap < Character, Integer> map = new HashMap<>();
  //   for (int i = 0 ; i < s.length(); i++)
  //   {
  //     map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);

  //   }
  //   int count = 0;
  //   for (char key : map.keySet()) {
  //     count += map.get(key) % 2;
  //   }
  //   return count <= 1;
  // }

  public boolean canPermutePalindrome(String s) {
    int[] map = new int[128];
    for( int i = 0 ;i < s.length();i++) {
      map[s.charAt(i)]++;
    }
    int count = 0;
    for (int key = 0; key < map.length && count <= 1; key++) {
      count += map[key] % 2;
    }
    return count <= 1;
  }
}