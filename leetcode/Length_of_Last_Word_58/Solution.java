package Length_of_Last_Word_58;

public class Solution {
  public static int lengthOfLastWord(String s) {
    int p = s.length() - 1;
    while (p >= 0 && s.charAt(p) == ' ') {
      p--;
    }

    int length = 0;
    while (p >= 0 && s.charAt(p) != ' ') {
      p--;
      length++;
    }

    return length;
  }

  public static void main(String args[])
  {
    String s = "   fly me   to   the moon  ";
    System.out.println(lengthOfLastWord(s));
  }
}
