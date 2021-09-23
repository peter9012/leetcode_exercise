public class one_away {
  boolean oneEditAway (String first, String second) {
    // Length check
    if(Math.abs(first.length() - second.length()) > 1) {
      return false;
    }
    // Get shorter and longer string
    String s1 = first.length() < second.length()? first:second;
    String s2 = first.length() < second.length()? second:first;

    int index1 = 0;
    int index2 = 0;

    boolean foundDifference = false;
    while (index2 < s2.length() && index1 < s1.length()) {
      if (s1.charAt(index1) != s2.charAt(index2)) {
        // Ensure that this is the first difference found.
        if (foundDifference) return false;
        foundDifference = true;
        if (s1.length() == s2.length()) {
          // on replace, move shorter point
          index1++;
        }
      } 
      else 
      {
        index1++; 
        // if matching, move shorter pointer 
      }
      //Always move pointer for longer string
      index2++;
    }  
    return true;
  }
}