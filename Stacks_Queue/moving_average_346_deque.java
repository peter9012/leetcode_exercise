package Stacks_Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class moving_average_346_deque {
  class MovingAverage {
    int size, windowSum = 0, count = 0;
    Deque queue = new ArrayDeque<Integer>();

    public MovingAverage(int size) {
      this.size = size;
    }

    public double next(int val) {
      ++count;
      // calculate the new sum by shifting the window
      queue.add(val);
      int tail = count > size ? (int)queue.poll() : 0;
  
      windowSum = windowSum - tail + val;
  
      return windowSum * 1.0 / Math.min(size, count);
    }
  }

  public static void main(String[] args)
    {
        // Initializing an deque
        Deque<String> dq = new ArrayDeque<String>();
  
        // add() method to insert
        dq.add("am");
        dq.addFirst("I");
        dq.addLast("engineer");
  
        System.out.println(dq);
  
        System.out.println(dq.pop());
  
        System.out.println(dq);

        System.out.println(dq.poll());
  
        System.out.println(dq.pollFirst());
  
        System.out.println(dq.pollLast());
    }
}
