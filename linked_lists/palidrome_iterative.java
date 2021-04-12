package linked_lists;

import java.util.Stack;

public class palidrome_iterative {
  static boolean isPalindrome(ListNode head) {
    ListNode fast = head;
    ListNode slow = head;

    Stack<Integer> stack = new Stack<Integer>();
    while( fast != null && fast.next != null) {
      stack.push(slow.val);
      slow = slow.next;
      fast = fast.next.next;
    }

    if(fast != null) {
      slow = slow.next;
    }

    while (slow != null) {
      int top = stack.pop().intValue();

      if(top != slow.val) {
        return false;
      }
      slow = slow.next;
    }

    return true;
  }

  public static void printList(ListNode head)
  {
		ListNode ptr = head;
      while (ptr != null)
      {
          System.out.print(ptr.val + " —> ");
          ptr = ptr.next;
      }
      System.out.println("null");
  }

  public static void main(String[] args) {
    int[] keys = {1, 2, 1};
    ListNode l1 = null;
    for (int i = keys.length - 1; i >= 0; i--) {
      l1 = new ListNode(keys[i],l1);
    }
    printList(l1);
    System.out.println(isPalindrome(l1));
  }
  
  
}
