package Java_Util;

import java.util.LinkedList;

public class LinkedList_Peek {
  public static void main(String[] args)
  {
    // declaring a LinkedList
    LinkedList list = new LinkedList();

    // adding  elements
    list.add("Geeks");
    list.add(4);
    list.add("Geeks");
    list.add("8");

    // printing the list
    System.out.println("The initial list is :" + list);

    // peek at the head of the list
    // Prints 1st element, "Geeks"
    System.out.println("Head of the list : " + list.peek());

    System.out.println("The initial list is :" + list);

    // peek at the first element of the list
    // Prints 1st element, "Geeks"
    System.out.println("First element of the list is : " + list.peekFirst());

    System.out.println("The initial list is :" + list);

    // peek at the last element of the list
    // Prints last element, 8
    System.out.println("Last element of the list is : " + list.peekLast());
  }
}
