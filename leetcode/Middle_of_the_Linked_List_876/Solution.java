package Middle_of_the_Linked_List_876;

public class Solution {
  public ListNode middleNode(ListNode head) {
    ListNode[] A = new ListNode[100];
    int t = 0;
    while (head != null) {
      A[t++] = head;
      head = head.next;
    }
    return A[t / 2];
  }
}
