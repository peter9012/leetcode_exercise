package linked_lists;

public class sum_lists {
  static ListNode addLists(ListNode l1, ListNode l2, int carry) {
    if(l1 == null && l2 == null && carry == 0) {
      return null;
    }
    ListNode result = new ListNode();
    int value = carry;
    if (l1 != null) {
      value += l1.val;
    }
    if (l2 != null) {
      value += l2.val;
    }
    result.val = value % 10;
    
    if(l1 != null || l2 != null) {
      ListNode more = addLists(l1 == null ? null : l1.next, l2 == null ? null : l2.next, value >= 10 ? 1 : 0);
      result.setNext(more);
    }
    return result;
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
    int[] keys = {7, 1, 6};
    ListNode l1 = null;
    for (int i = keys.length - 1; i >= 0; i--) {
      l1 = new ListNode(keys[i],l1);
    }
    printList(l1);
    int[] vals = {5, 9, 2};
    ListNode l2 = null;
    for (int i = vals.length - 1; i >= 0; i--) {
      l2 = new ListNode(vals[i],l2);
    }
    printList(l2);
    ListNode result = addLists(l1, l2, 0);
    printList(result);
  }
  
}
