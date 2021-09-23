package linked_lists;

class Result1 {
  public ListNode tail;
  public int size;
  public Result1(ListNode tail, int size) {
    this.tail= tail;
    this.size= size;
  }
}

public class intersection_linklist {


  static Result1 getTailAndSize(ListNode list) {
    if (list == null) return null;

    int size = 1;
    ListNode current = list;
    while(current.next != null) {
      size++;
      current = current.next;
    }
    return new Result1(current, size);
  }

  static ListNode getKthNode(ListNode head, int k) {
    ListNode current = head;
    while(k > 0 && current!= null) {
      current = current.next;
      k--;
    }
    return current;
  }

  static ListNode findintersection(ListNode list1, ListNode list2) {
    if(list1 == null || list2 == null) return null;

    Result1 result1 = getTailAndSize(list1);
    Result1 result2 = getTailAndSize(list2);

    if (result1.tail != result2.tail) {
      return null;
    }

    ListNode shorter = result2.size < result2.size? list1 : list2;
    ListNode longer = result1.size < result2.size ? list2 : list1;
    
    longer = getKthNode(longer, Math.abs(result1.size - result2.size));

    while(shorter != longer) {
      shorter = shorter.next;
      longer = longer.next;
    }

    return longer;

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
    // int[] keys = {3, 6, 8, 10, 11, 12};
    // ListNode l1 = null;
    // for (int i = keys.length - 1; i >= 0; i--) {
    //   l1 = new ListNode(keys[i],l1);
    // }
    // printList(l1);
    // int[] vals = {1, 2, 10, 11, 12};
    // ListNode l2 = null;
    // for (int i = keys.length - 1; i >= 0; i--) {
    //   l2 = new ListNode(vals[i],l2);
    // }
    // printList(l2);

    ListNode list1 = new ListNode(3);
    list1.next = new ListNode(6);
    list1.next.next = new ListNode(9);
    list1.next.next.next = new ListNode(15);
    list1.next.next.next.next = new ListNode(30);
    printList(list1);

    // creating second linked list
    ListNode list2 = new ListNode(8);
    list2.next = new ListNode(15);
    list2.next.next = new ListNode(30);
    printList(list2);
    printList(findintersection(list1,list2));
  }

}
