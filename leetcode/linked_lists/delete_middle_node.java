package linked_lists;

public class delete_middle_node {
  boolean deleteNode(LinkedListNode n) {
    if(n == null || n.next == null) {
      return false;
    }
    LinkedListNode node = n.next;
    n.data = node.data;
    n.next = node.next;
    return true;
  }
}
