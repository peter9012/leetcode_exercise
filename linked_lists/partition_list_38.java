package linked_lists;

class ListNode {
  int val;
  ListNode next;
  ListNode() {}
  ListNode(int val) { this.val = val; }
  ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  public void setNext(ListNode nextNode) {
    next = nextNode;
  }
}

public class partition_list_38 {
  public ListNode partition(ListNode head, int x) {
    ListNode before_head = new ListNode(0);
    ListNode before = before_head;
    ListNode after_head = new ListNode(0);
    ListNode after = after_head;

    while (head != null) {

      // If the original list node is lesser than the given x,
      // assign it to the before list.
      if (head.val < x) {
          before.next = head;
          before = before.next;
      } else {
          // If the original list node is greater or equal to the given x,
          // assign it to the after list.
          after.next = head;
          after = after.next;
      }

      // move ahead in the original list
      head = head.next;
    }
    
    after.next = null;

    // Once all the nodes are correctly assigned to the two lists,
    // combine them to form a single list which would be returned.
    before.next = after_head.next;

    return before_head.next;
  }
}
