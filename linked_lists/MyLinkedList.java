package linked_lists;


public class MyLinkedList {

  public class SinglyListNode {
    int val;
    SinglyListNode next;
    SinglyListNode(int x) { val = x; }
  }

  private SinglyListNode head;

  public void MyLinkedList() {
      head = null;
  }

  private SinglyListNode getNode(int index) {
    SinglyListNode cur = head;
    for (int i = 0; i < index && cur != null; ++i) {
        cur = cur.next;
    }
    return cur;
  }

  private SinglyListNode getTail() {
    SinglyListNode cur = head;
    while (cur != null && cur.next != null) {
        cur = cur.next;
    }
    return cur;
  }

  public int get(int index) {
    SinglyListNode cur = getNode(index);
    return cur == null ? -1 : cur.val;
  }

  public void addAtHead(int val) {
    SinglyListNode cur = new SinglyListNode(val);
    cur.next = head;
    head = cur;
    return;
  }

  public void addAtTail(int val) {
    if (head == null) {
        addAtHead(val);
        return;
    }
    SinglyListNode prev = getTail();
    SinglyListNode cur = new SinglyListNode(val);
    prev.next = cur;
  }

  public void addAtIndex(int index, int val) {
    if (index == 0) {
        addAtHead(val);
        return;
    }
    SinglyListNode prev = getNode(index - 1);
    if (prev == null) {
        return;
    }
    SinglyListNode cur = new SinglyListNode(val);
    SinglyListNode next = prev.next;
    cur.next = next;
    prev.next = cur;
  }

  public void deleteAtIndex(int index) {
    SinglyListNode cur = getNode(index);
    if (cur == null) {
        return;
    }
    SinglyListNode prev = getNode(index - 1);
    SinglyListNode next = cur.next;
    if (prev != null) {
        prev.next = next;
    } else {
        // modify head when deleting the first node.
        head = next;
    }
  }
}

