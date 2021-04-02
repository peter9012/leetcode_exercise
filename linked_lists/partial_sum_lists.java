package linked_lists;

class PartialSum {
  public ListNode sum = null;
  public int carry = 0;
}


public class partial_sum_lists {
  static ListNode addlists (ListNode l1, ListNode l2) {
    int len1 = length(l1);
    int len2 = length(l2);
  
    if(len1 < len2) {
      l1 = padList(l1, len2 - len1);
    } else {  
      l2 = padList(l2, len1 - len2);
    }

    PartialSum sum = addListsHelper(l1,l2);

    if(sum.carry == 0) {
      return sum.sum;
    } else {
      ListNode result = insertBefore(sum.sum, sum.carry);
      return result;
    }
  }

  static PartialSum addListsHelper(ListNode l1, ListNode  l2) {
    if ( l1 == null && l2 == null) {
      PartialSum sum = new PartialSum();
      return sum;
    }
    PartialSum sum = addListsHelper(l1.next,l2.next);

    int val = sum.carry + l1.val + l2.val;

    ListNode full_result = insertBefore(sum.sum, val % 10);

    sum.sum = full_result;
    sum.carry = val/10;
    return sum;
  }
  
  static ListNode padList(ListNode l, int padding) {
    ListNode head = l;
    for (int i = 0; i < padding; i++) {
      head = insertBefore(head,0);
    }
    return head;
  }

  static ListNode insertBefore(ListNode list, int data) {
    ListNode node = new ListNode(data);
    if (list != null) {
      node.next = list;
    }
    return node;
  }

  public static int length(ListNode head) {
    ListNode temp = head;
    int count = 0;
    while (temp != null) {
      count++;
      temp = temp.next;
    }
    return count;
  }

  public static void printList(ListNode head)
  {
		ListNode ptr = head;
      while (ptr != null)
      {
          System.out.print(ptr.val + " —> ");
          ptr = ptr.next;
      }
      System.out.println("null");
  }


  public static void main(String[] args) {
    // int[] keys = {6,1,7};
    int[] keys = {1,2,3,4};
    ListNode l1 = null;
    for (int i = keys.length - 1; i >= 0; i--) {
      l1 = new ListNode(keys[i],l1);
    }
    printList(l1);
    int[] vals = {2,9,5};
    ListNode l2 = null;
    for (int i = vals.length - 1; i >= 0; i--) {
      l2 = new ListNode(vals[i],l2);
    }
    printList(l2);
    ListNode result = addlists(l1,l2);
    printList(result);
  }

}

