package linked_lists;

public class find_k_postion_to_last_linklist {
	
	static int printKthToLast(LinkedListNode head, int k) {
		if (head == null) {
			return 0;
		}
		int index = printKthToLast(head.next, k) + 1;
		if (index == k) {
			System.out.println(k + "th to last node is " + head.data);
		}
		return index;
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
		 int[] keys = {1, 2, 3, 4};
		 LinkedListNode head = null;
		 for (int i = keys.length - 1; i >= 0; i--) {
      head = new LinkedListNode(keys[i],head);
		 }
		 System.out.println("Linked List : \n ");
		 printList(head);
		 printKthToLast(head,3);
	}

}
