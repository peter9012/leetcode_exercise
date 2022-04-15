package Word_Search_79;

public class Solution {

  public static boolean exist(char[][] board, String word) {
    int h = board.length, w = board[0].length;
    boolean[][] visited = new boolean[h][w];
    for (int i = 0; i < h; i++) {
      for (int j = 0; j < w; j++) {
        boolean flag = check(board, visited, i, j, word, 0);
        if (flag) {
          return true;
        }
      }
    }
    return false;
  }

  public static boolean check(char[][] board, boolean[][] visited, int i, int j, String s, int k) {
    if (board[i][j] != s.charAt(k)) {
      return false;
    } else if (k == s.length() - 1) {
      return true;
    }
    visited[i][j] = true;
    int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    boolean result = false;
    for (int[] dir : directions) {
      int newi = i + dir[0], newj = j + dir[1];
      if (newi >= 0 && newi < board.length && newj >= 0 && newj < board[0].length) {
        if (!visited[newi][newj]) {
          boolean flag = check(board, visited, newi, newj, s, k + 1);
          if (flag) {
            result = true;
            break;
          }
        }
      }
    }
    visited[i][j] = false;
    return result;
  }

  public static void main(String args[])
  {
    char[][] grid = { { 'G', 'E', 'E', 'K', 'S', 'F', 'O', 'R', 'G', 'E', 'E', 'K', 'S' },
            { 'G', 'E', 'E', 'K', 'S', 'Q', 'U', 'I', 'Z', 'G', 'E', 'E', 'K' },
            { 'I', 'D', 'E', 'Q', 'A', 'P', 'R', 'A', 'C', 'T', 'I', 'C', 'E' } };
    System.out.println(exist(grid, "GEEKS"));

    char[][] grid02 = { { 'A', 'B', 'C', 'E' },
            { 'S', 'F', 'C', 'S' },
            { 'A', 'D', 'E', 'E' } };
    System.out.println(exist(grid02, "SEE"));
  }
}
