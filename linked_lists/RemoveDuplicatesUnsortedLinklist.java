package linked_lists;

import java.util.HashSet;

class LinkedListNode {
  int data;
  LinkedListNode next;

  LinkedListNode(int data, LinkedListNode next) {
    this.data = data;
    this.next = next;
  }
}

public class RemoveDuplicatesUnsortedLinklist {
	
  
	static void deleteDups(LinkedListNode n) {
		HashSet<Integer> set = new HashSet<Integer>();
		LinkedListNode previous = null;
		while (n != null) {
			if(set.contains(n.data)) {
				previous.next = n.next;
			}
			else 
			{
				set.add(n.data);
				previous = n;
			}
			n = n.next;
		}
	}
	
	static void deleteDupNoBuffer(LinkedListNode head) {
		LinkedListNode current = head;
		while (current != null) {
			LinkedListNode runner = current;
			while (runner.next != null) {
				if (runner.next.data == current.data) {
					runner.next = current.next.next;
				}
				else {
					runner = runner.next;
				}
			}
			current = current.next;
		}
//		return head;
	}
	
	
	public static void printList(LinkedListNode head)
  {
		LinkedListNode ptr = head;
      while (ptr != null)
      {
          System.out.print(ptr.data + " —> ");
          ptr = ptr.next;
      }
      System.out.println("null");
  }
	
	public static void main(String[] args) {
		 int[] keys = {5, 1, 1, 2};
		 LinkedListNode head = null;
		 for (int i = keys.length - 1; i >= 0; i--) {
       head = new LinkedListNode(keys[i],head);
		 }
		 System.out.println("Linked List before removing duplicates : \n ");
		 printList(head);
		 deleteDupNoBuffer(head);
		 System.out.println("Linked List after removing duplicates : \n ");
		 printList(head);
		 
//		 int[] keys = {5, 1, 1, 2, 3, 3, 11, 2, 12};
//		 LinkedListNode head = null;
//		 for (int i = keys.length - 1; i >= 0; i--) {
//       head = new LinkedListNode(keys[i],head);
//		 }
//		 System.out.println("Linked List before removing duplicates : \n ");
//		 printList(head);
//		 System.out.println("Linked List after removing duplicates : \n ");
//		 deleteDups(head);
//		 printList(head);
	}
	
}
