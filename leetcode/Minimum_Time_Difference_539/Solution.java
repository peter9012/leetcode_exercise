package Minimum_Time_Difference_539;

import java.util.*;

public class Solution {
  public static int findMinDifference(List<String> timePoints) {
    if (timePoints.size() > 24 * 60) {
      return 0;
    }
    List<Integer> mins = new ArrayList<>();
    for (String t : timePoints) {
      String[] time = t.split(":");
      mins.add(Integer.parseInt(time[0]) * 60 + Integer.parseInt(time[1]));
    }
    Collections.sort(mins);
    mins.add(mins.get(0) + 24 * 60);
    int res = 24 * 60;
    for (int i = 1; i < mins.size(); ++i) {
      res = Math.min(res, mins.get(i) - mins.get(i - 1));
    }
    return res;
  }

  public static void main(String[] args) {
    String[] timePoints = {"23:30","23:59","12:00","24:00"};
    System.out.println(findMinDifference(List.of(timePoints)));
  }
}
