package linked_lists;

public class delete_middle_node {
  boolean deleteNode(LinkedListNode n) {
    if(n == null || n.next == null) {
      return false;
    }
    LinkedListNode next = n.next;
    n.data = next.data;
    n.next = next.next;
    return true;
  }
}
