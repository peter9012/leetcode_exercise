package linked_lists;

public class find_kth_to_last_element_wrapper {
  class Index {
    public int value = 0;
  }
  LinkedListNode kthToLast(LinkedListNode head, int k) {
    Index idx = new Index();
    return kthToLast(head, k, idx);
  }
  LinkedListNode kthToLast(LinkedListNode head, int k, Index idx) {
    if (head == null) {
      return null;
    }
    LinkedListNode node = kthToLast(head.next, k, idx);
    idx.value = idx.value + 1;
    if (idx.value == k) {
      return head;
    }
    return node;
  }
}
