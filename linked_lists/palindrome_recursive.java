package linked_lists;

class Result {
  ListNode node;
  boolean result;
  Result(ListNode next, boolean b) {
    this.node = next;
    this.result = b;
  }
}

public class palindrome_recursive {
  static boolean isPalindrome(ListNode head) {
    int length = lengthOfList(head);
    Result p = isPalindromeRecurse(head, length);
    return p.result;
  }

  static Result isPalindromeRecurse (ListNode head, int length) {
    if(head == null || length <= 0) {
      return new Result(head, true);
    } else if (length == 1) {
      return new Result(head.next, true);
    }

    Result res = isPalindromeRecurse(head.next, length - 2);

    if(!res.result || res.node == null) {
      return res;
    }

    res.result = (head.val == res.node.val);

    res.node = res.node.next;

    return res;

  }

  static int lengthOfList(ListNode n) {
    int size = 0;
    while(n != null) {
      size++;
      n = n.next;
    }
    return size;
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
    int[] keys = {1, 4, 3, 2, 1};
    ListNode l1 = null;
    for (int i = keys.length - 1; i >= 0; i--) {
      l1 = new ListNode(keys[i],l1);
    }
    printList(l1);
    System.out.println(isPalindrome(l1));
  }
}

