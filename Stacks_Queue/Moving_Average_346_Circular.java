package Stacks_Queue;

public class Moving_Average_346_Circular {
  public static class MovingAverage {
    int size, head = 0, windowSum = 0, count = 0;
    int[] queue;
    public MovingAverage(int size) {
      this.size = size;
      queue = new int[size];
    }
  
    public double next(int val) {
      ++count;
      // calculate the new sum by shifting the window
      int tail = (head + 1) % size;
      windowSum = windowSum - queue[tail] + val;
      // move on to the next head
      head = (head + 1) % size;
      queue[head] = val;
      return windowSum * 1.0 / Math.min(size, count);
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
