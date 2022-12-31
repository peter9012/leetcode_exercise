package Queue_Reconstruction_by_Height_406;

import java.util.*;

public class Solution {
  public static int[][] reconstructQueue(int[][] people) {
    // 身高从大到小排（身高相同k小的站前面）
    Arrays.sort(people, (a, b) -> {
      if (a[0] == b[0]) return a[1] - b[1];
      return b[0] - a[0];
    });

    LinkedList<int[]> que = new LinkedList<>();

    for (int[] p : people) {
      que.add(p[1],p);
    }

    return que.toArray(new int[people.length][]);
  }
  public static void main(String[] args)
  {
    int[][] people = {{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};
    int[][] output = reconstructQueue(people);
    System.out.println(Arrays.deepToString(output));
  }
}
