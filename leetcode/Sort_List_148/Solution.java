package Sort_List_148;

public class Solution {
  public static ListNode sortList(ListNode head) {
    if (head == null || head.next == null)
      return head;
    ListNode mid = getMid(head);
    ListNode left = sortList(head);
    ListNode right = sortList(mid);
    return merge(left, right);
  }

  static ListNode merge(ListNode list1, ListNode list2) {
    ListNode dummyHead = new ListNode();
    ListNode tail = dummyHead;
    while (list1 != null && list2 != null) {
      if (list1.val < list2.val) {
        tail.next = list1;
        list1 = list1.next;
        tail = tail.next;
      } else {
        tail.next = list2;
        list2 = list2.next;
        tail = tail.next;
      }
    }
    tail.next = (list1 != null) ? list1 : list2;
    return dummyHead.next;
  }

  static ListNode getMid(ListNode head) {
    ListNode midPrev = null;
    while (head != null && head.next != null) {
      midPrev = (midPrev == null) ? head : midPrev.next;
      head = head.next.next;
    }
    ListNode mid = midPrev.next;
    midPrev.next = null;
    return mid;
  }

  static void printList(ListNode head)
  {
    while (head != null) {
      System.out.print(head.val + " ");
      head = head.next;
    }
  }

  public static void main(String[] args)
  {
    ListNode head = new ListNode(7);
    ListNode temp = head;
    temp.next = new ListNode(10);
    temp = temp.next;
    temp.next = new ListNode(5);
    temp = temp.next;
    temp.next = new ListNode(20);
    temp = temp.next;
    temp.next = new ListNode(3);
    temp = temp.next;
    temp.next = new ListNode(2);
    temp = temp.next;
    temp.next = new ListNode(9);
    temp = temp.next;

    System.out.print("\nLinked List is: \n");
    printList(head);
    // Apply merge Sort
    head = sortList(head);
    System.out.print("\nSorted Linked List is: \n");
    printList(head);
  }
}

