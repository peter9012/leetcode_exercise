package Most_Stones_Removed_with_Same_Row_or_Column_947;

import java.util.*;

public class Solution {
  // Return true if stone a and b shares row or column
  static boolean shareSameRowOrColumn(int[] a, int[] b) {
    return a[0] == b[0] || a[1] == b[1];
  }

  static void dfs(int[][] stones, List<Integer>[] adj, int[] visited, int src) {
    // Mark the stone as visited
    visited[src] = 1;

    // Iterate over the adjacent, and iterate over it if not visited yet
    for (int adjacent : adj[src]) {
      if (visited[adjacent] == 0) {
        dfs(stones, adj, visited, adjacent);
      }
    }
  }

  static int removeStones(int[][] stones) {
    // Adjacency list to store edges
    List<Integer>[] adj = new ArrayList[stones.length];
    for (int i = 0; i < stones.length; i++) {
      adj[i] = new ArrayList<>();
    }

    for (int i = 0; i < stones.length; i++) {
      for (int j = i + 1; j < stones.length; j++) {
        if (shareSameRowOrColumn(stones[i], stones[j])) {
          adj[i].add(j);
          adj[j].add(i);
        }
      }
    }

    // Array to mark visited stones
    int[] visited = new int[stones.length];
    // Counter for connected components
    int componentCount = 0;
    for (int i = 0; i < stones.length; i++) {
      if (visited[i] == 0) {
        // If the stone is not visited yet,
        // Start the DFS and increment the counter
        componentCount++;
        dfs(stones, adj, visited, i);
      }
    }

    // Return the maximum stone that can be removed
    return stones.length - componentCount;
  }
  public static void main(String[] args) {
    int [][]stones = {{0,0},{0,1},{1,0},{1,2},{2,1},{2,2}};
    System.out.println("The maximum stone that can be removed: s"+ removeStones(stones));
  }
}
