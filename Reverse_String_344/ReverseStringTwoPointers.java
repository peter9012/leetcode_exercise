package Reverse_String_344;

public class ReverseStringTwoPointers {
  public void reverseString(char[] s){
    int left = 0, right = s.length - 1;
    while (left < right) {
      char tmp = s[left];
      s[left++] = s[right];
      s[right--] = tmp;
    }
  }
}
