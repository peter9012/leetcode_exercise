package Stacks_Queue;

import java.util.*;

public class Moving_Average_346 {
  static class MovingAverage {
    int size;
    List queue = new ArrayList<Integer>();

    public MovingAverage(int size) {
      this.size = size;
    }

    public double next(int val) {
      queue.add(val);
      int windowSum = 0;
      for(int i = Math.max(0, queue.size() - size); i < queue.size(); ++i)
      windowSum += (int)queue.get(i);
      return windowSum * 1.0 / Math.min(queue.size(), size);
    }
    
  }

  public static void main(String[] args)
  {
      int[] input_data = { 1, 10, 3, 5};
      int per = 3;
      MovingAverage obj = new MovingAverage(per);
      for (int x : input_data) {
          double value = obj.next(x);
          System.out.println("New number added is " +
                              x + ", SMA = " + value);
      }
  }
}
