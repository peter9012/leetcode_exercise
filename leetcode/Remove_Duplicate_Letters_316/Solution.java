package Remove_Duplicate_Letters_316;

import java.util.*;

public class Solution {
  public static String removeDuplicateLetters(String sr) {

    int[] res = new int[26];
    boolean[] visited = new boolean[26];
    char[] ch = sr.toCharArray();
    for(char c: ch) {
      res[c-'a']++;
    }
    Stack<Character> st = new Stack<>();
    int index;
    for(char s: ch)  {
      index= s -'a';
      res[index]--;
      if(visited[index])
        continue;
      while(!st.isEmpty() && s<st.peek() && res[st.peek()-'a']!=0)
      {
        visited[st.pop()-'a']=false;
      }
      st.push(s);
      visited[index]=true;
    }

    StringBuilder sb = new StringBuilder();
    while(!st.isEmpty())  {
      sb.insert(0,st.pop());
    }
    return sb.toString();
  }

  public static void main(String[] args)
  {
    String text = "cbacdcbc";
    System.out.println(removeDuplicateLetters(text));
  }
}
