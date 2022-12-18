package Gas_Station_134;

public class Solution {
  public static int canCompleteCircuit(int[] gas, int[] cost) {
    int sum = 0;
    int min = 0;
    for (int i = 0; i < gas.length; i++) {
      sum += (gas[i] - cost[i]);
      min = Math.min(sum, min);
    }

    if (sum < 0) return -1;
    if (min >= 0) return 0;

    for (int i = gas.length - 1; i > 0; i--) {
      min += (gas[i] - cost[i]);
      if (min >= 0) return i;
    }

    return -1;
  }
  public static void main(String args[])
  {
    int gas[] = { 1,2,3,4,5 };
    int cost[] = {3,4,5,1,2};
    System.out.println(canCompleteCircuit(gas,cost));
  }
}
