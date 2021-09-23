package Swap_Nodes_in_Pairs_24;

public class LinkNodeSwapNodesRecursion {

  ListNode head;

  static class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { 
      val = x; 
    }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

  public void printList()
  {
    ListNode n = head;
      while (n != null) {
          System.out.print(n.val + " ");
          n = n.next;
    }
  }

  static void printLists(ListNode node)
    {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }

  public ListNode swapPairs(ListNode test) {

    if((test == null) || (test.next == null)) {
      return test;
    }
    
    ListNode firstNode = test;
    ListNode secondNode = test.next;

    firstNode.next = swapPairs(secondNode.next);
    secondNode.next = firstNode;

    return secondNode;

  }

  
  public static void main(String[] args) {
    LinkNodeSwapNodesRecursion list = new LinkNodeSwapNodesRecursion();
    list.head = new ListNode(1);
    ListNode second = new ListNode(2);
    ListNode third = new ListNode(3);
    ListNode four = new ListNode(4);

    list.head.next = second;
    second.next = third;
    third.next = four;
    System.out.println("Linked list before calling swapPairs() ");
    printLists(list.head);
    System.out.println("");
    ListNode st = list.swapPairs(list.head);
    System.out.println("Linked list after calling swapPairs() ");
    printLists(st);
  }
}
