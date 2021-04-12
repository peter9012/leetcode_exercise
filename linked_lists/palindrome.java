package linked_lists;

public class palindrome {
  static boolean isPalindrome(ListNode head) {
    ListNode reversed = reverseAndClone(head);
    return isEqual(head, reversed);
  }

  static ListNode reverseAndClone(ListNode node) {
    ListNode head = null;
    while (node != null) {
      ListNode n = new ListNode(node.val);
      n.next = head;
      head = n;
      node = node.next;
    }
    return head;
  }

  static boolean isEqual(ListNode one, ListNode two) {
    while(one != null && two != null) {
      if(one.val != two.val) {
        return false;
      }
      one = one.next;
      two = two.next;
    }
    return one == null && two == null;
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
