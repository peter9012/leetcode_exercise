package Partition_Labels_763;

import java.util.*;

public class Solution {
  public static List<Integer> partitionLabels(String S) {
    List<Integer> list = new LinkedList<>();
    int[] edge = new int[26];
    char[] chars = S.toCharArray();
    for (int i = 0; i < chars.length; i++) {
      edge[chars[i] - 'a'] = i;
    }
    int idx = 0;
    int last = -1;
    for (int i = 0; i < chars.length; i++) {
      idx = Math.max(idx,edge[chars[i] - 'a']);
      if (i == idx) {
        list.add(i - last);
        last = i;
      }
    }
    return list;
  }
  public static void main(String[] args)
  {
    String s = "ababcbacadefegdehijhklij";
    System.out.println(partitionLabels(s));
  }
}
