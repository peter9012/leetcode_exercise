package Design_Hit_Counter_362;

import java.util.*;

public class Solution {

  static class HitCounter {
    private Queue<Integer> hits;

    public HitCounter() {
      this.hits = new LinkedList<Integer>();
    }

    public void hit(int timestamp) {
      this.hits.add(timestamp);
    }

    public int getHits(int timestamp) {
      while (!this.hits.isEmpty()) {
        int diff = timestamp - this.hits.peek();
        if (diff >= 300) this.hits.remove();
        else break;
      }
      return this.hits.size();
    }

  }
  public static void main(String[] args)
  {
    HitCounter obj = new HitCounter();
    obj.hit(1);
    obj.hit(2);
    obj.hit(3);
    int param_2 = obj.getHits(4);
    System.out.println(param_2);
  }
}
