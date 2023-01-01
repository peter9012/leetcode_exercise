package Non_overlapping_Intervals_435;

import java.util.Arrays;

public class Solution {
  public static int eraseOverlapIntervals(int[][] intervals) {
    Arrays.sort(intervals, (a, b)-> {
      return Integer.compare(a[0],b[0]);
    });
    int count = 1;
    for(int i = 1;i < intervals.length;i++){
      if(intervals[i][0] < intervals[i-1][1]){
        intervals[i][1] = Math.min(intervals[i - 1][1], intervals[i][1]);
        continue;
      }else{
        count++;
      }
    }
    return intervals.length - count;
  }
  public static void main(String[] args)
  {
    int[][] intervals = {{1,2},{2,3},{3,4},{1,3}};
    System.out.println(eraseOverlapIntervals(intervals));
  }
}
