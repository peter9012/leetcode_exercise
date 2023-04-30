package Odd_Even_Linked_List_328;

public class Solution {
  public static ListNode oddEvenList(ListNode head) {
    if (head == null) return null;
    ListNode odd = head, even = head.next, evenHead = even;
    while (even != null && even.next != null) {
      odd.next = even.next;
      odd = odd.next;
      even.next = odd.next;
      even = even.next;
    }
    odd.next = evenHead;
    return head;
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
    ListNode list1 = new ListNode(1);
    list1.next = new ListNode(2);
    list1.next.next = new ListNode(3);
    list1.next.next.next = new ListNode(4);
    list1.next.next.next.next = new ListNode(5);
    printList(list1);
    printList(oddEvenList(list1));
  }
}
