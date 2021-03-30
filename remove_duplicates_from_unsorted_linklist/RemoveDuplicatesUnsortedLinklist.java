package remove_duplicates_from_unsorted_linklist;

import java.util.HashSet;

public class RemoveDuplicatesUnsortedLinklist {
	
  static class LinkedListNode {
    int data;
    LinkedListNode next;

    public LinkedListNode(int data) {
      this.data = data;
    }
  }
  
	void deleteDups(LinkedListNode n){
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
}
