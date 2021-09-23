import java.util.*;

public class remove_dups {

  static class LinkedListNode 
    {
        int data;
        LinkedListNode next;
 
        public LinkedListNode(int data) 
        {
            this.data = data;
        }
    }

    static void deleteDups(LinkedListNode head) {
      LinkedListNode current = head;
      while (current != null) {
        LinkedListNode runner = current;
        while (runner.next != null) {
          if (runner.next.data == current.data) {
            runner.next = runner.next.next;
          } else {
            runner = runner.next;
          }
        }
        current = current.next;
      }
    }

    static void printList(LinkedListNode head) {
      while (head != null) {
        System.out.print(head.data + " ");
        head = head.next;
      }
    }

    public static void main(String[] args) {
      /*
       * The constructed linked list is: 10->12->11->11->12->11->10
       */
      LinkedListNode start = new LinkedListNode(5);
      start.next = new LinkedListNode(12);
      start.next.next = new LinkedListNode(11);
      start.next.next.next = new LinkedListNode(11);
      start.next.next.next.next = new LinkedListNode(13);

      System.out.println("Linked list before removing duplicates :");
      printList(start);

      deleteDups(start);
      System.out.println("\nLinked list after removing duplicates :");
      printList(start);
    }
}