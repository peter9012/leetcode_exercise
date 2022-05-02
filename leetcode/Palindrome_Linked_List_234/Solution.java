package Palindrome_Linked_List_234;

import java.util.*;

public class Solution {
  public boolean isPalindrome(ListNode head) {
    List<Integer> vals = new ArrayList<>();
    ListNode currentNode = head;
    while (currentNode != null) {
      vals.add(currentNode.val);
      currentNode = currentNode.next;
    }
    int front = 0;
    int back = vals.size() - 1;
    while (front < back) {
      if (!vals.get(front).equals(vals.get(back))) {
        return false;
      }
      front++;
      back--;
    }
    return true;
  }
}
