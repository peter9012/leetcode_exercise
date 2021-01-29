public class Longest_common_prefix {
  public String longestCommonPrefix(String[] strs) {
    // Time complexity : O(S)O(S) , where S is the sum of all characters in all strings.
    // Space complexity : O(1)O(1). We only used constant extra space.
  //   if (strs.length == 0) return "";
  //   String prefix = strs[0];
  //   for (int i = 0; i < strs.length; i++) {
  //     while(strs[i].indexOf(prefix) != 0) {
  //       prefix = prefix.substring(0, prefix.length() - 1);
  //       if (prefix.isEmpty()) return "";
  //     }
  //   }
  //   return prefix;
  if (strs == null || strs.length == 0) return "";
  int l =  strs[0].length();
    for (int i = 0; i < strs[0].length() ; i++){
      char c = strs[0].charAt(i);
      for (int j = 1; j < strs.length; j ++) {
        if (i == strs[j].length() || strs[j].charAt(i) != c)
          return strs[0].substring(0, i);             
        }
    }
    return strs[0];

  }
}