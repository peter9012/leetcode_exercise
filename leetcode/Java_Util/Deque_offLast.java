package Java_Util;

import java.util.*;

public class Deque_offLast {
  public static void main(String[] args) throws IllegalStateException
  {

    // create object of Deque
    Deque<Integer> DQ = new LinkedList<Integer>();

    if (DQ.offerLast(10))
      System.out.println("The Deque is not full and 10 is inserted");
    else
      System.out.println("The Deque is full");

    if (DQ.offerLast(15))
      System.out.println("The Deque is not full and 15 is inserted");
    else
      System.out.println("The Deque is full");

    if (DQ.offerLast(25))
      System.out.println("The Deque is not full and 25 is inserted");
    else
      System.out.println("The Deque is full");

    if (DQ.offerLast(20))
      System.out.println("The Deque is not full and 20 is inserted");
    else
      System.out.println("The Deque is full");

    // before removing print Deque
    System.out.println("Deque: " + DQ);
  }
}
