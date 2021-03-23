public class kth_to_last_element {
  static LinkedListNode head;

  static class LinkedListNode {
    int data;
    LinkedListNode next;

    public LinkedListNode(int data) {
      this.data = data;
    }
  }

  public void push(int new_data) {
    LinkedListNode new_node = new LinkedListNode(new_data);
    new_node.next = head;
    head = new_node;
  }

  public static void insertAfter(LinkedListNode head, int new_data) {
    LinkedListNode new_node = new LinkedListNode(new_data);
    new_node.next = head.next;
    head.next = new_node;
  }

  static void printList(LinkedListNode head) {
    while (head != null) {
      System.out.print(head.data + " ");
      head = head.next;
    }
  }

  static int printKthToLast(LinkedListNode head, int k) {
    if (head == null) {
      return 0;
    }
    int index = printKthToLast(head.next, k) + 1;
    if (index == k) {
      System.out.println("\n" + k + "th to last node is " + head.data);
    }
    return index;
  }

  public static void main(String[] args) {
    kth_to_last_element list = new kth_to_last_element();
    list.push(12);
    list.push(13);
    list.push(14);
    list.printList(head);
    
    // LinkedListNode start = new LinkedListNode(5);
    // insertAfter(start, 12);
    // insertAfter(start, 11);
    // insertAfter(start, 11);
    // insertAfter(start, 13);
    // printList(start);
    // printKthToLast(start, 1);
  }
}

// Simple Java program to find n'th node from end of linked list
// class LinkedList {
// 	Node head; // head of the list

// 	/* Linked List node */
// 	class Node {
// 		int data;
// 		Node next;
// 		Node(int d)
// 		{
// 			data = d;
// 			next = null;
// 		}
// 	}

// 	/* Function to get the nth node from the last of a
// 	linked list */
// 	void printNthFromLast(int n)
// 	{
// 		int len = 0;
// 		Node temp = head;

// 		// 1) count the number of nodes in Linked List
// 		while (temp != null) {
// 			temp = temp.next;
// 			len++;
// 		}

// 		// check if value of n is not more than length of
// 		// the linked list
// 		if (len < n)
// 			return;

// 		temp = head;

// 		// 2) get the (len-n+1)th node from the beginning
// 		for (int i = 1; i < len - n + 1; i++)
// 			temp = temp.next;

// 		System.out.println(temp.data);
// 	}

// 	/* Inserts a new Node at front of the list. */
// 	public void push(int new_data)
// 	{
// 		/* 1 & 2: Allocate the Node &
// 				Put in the data*/
// 		Node new_node = new Node(new_data);

// 		/* 3. Make next of new Node as head */
// 		new_node.next = head;

// 		/* 4. Move the head to point to new Node */
// 		head = new_node;
// 	}

// 	/*Driver program to test above methods */
// 	public static void main(String[] args)
// 	{
// 		LinkedList llist = new LinkedList();
// 		llist.push(20);
// 		llist.push(4);
// 		llist.push(15);
// 		llist.push(35);

// 		llist.printNthFromLast(4);
// 	}
// } // This code is contributed by Rajat Mishra
