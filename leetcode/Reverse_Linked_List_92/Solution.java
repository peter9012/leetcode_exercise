package Reverse_Linked_List_92;

public class Solution {
  public static ListNode reverseBetween(ListNode head, int m, int n) {
    // base case
    if (m == 1) {
      return reverseN(head, n);
    }
    // 前进到反转的起点触发 base case
    head.next = reverseBetween(head.next, m - 1, n - 1);
    return head;
  }

  static ListNode successor = null; // 后驱节点
  // 反转以 head 为起点的 n 个节点，返回新的头结点
  static ListNode reverseN(ListNode head, int n) {
    if (n == 1) {
      // 记录第 n + 1 个节点
      successor = head.next;
      return head;
    }
    // 以 head.next 为起点，需要反转前 n - 1 个节点
    ListNode last = reverseN(head.next, n - 1);

    head.next.next = head;
    // 让反转之后的 head 节点和后面的节点连起来
    head.next = successor;
    return last;
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
    printList(reverseBetween(list1,2,4));
  }

}
