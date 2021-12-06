package Java_Util;

import java.util.*;

public class Peek_Method {
  public static void main(String[] args) throws IllegalStateException
  {
    // create object of Queue
    Queue<Integer> Q = new LinkedList<Integer>();
    // Add numbers to end of Queue
    Q.add(7855642);
    Q.add(35658786);
    Q.add(5278367);
    Q.add(74381793);
    Q.add(889988);
    // print queue
    System.out.println("Queue: " + Q);
    // print head
    System.out.println("Queue's head: " + Q.peek());
    // print queue
    System.out.println("Queue: " + Q);
  }
}
