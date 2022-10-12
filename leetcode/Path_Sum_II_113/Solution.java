package Path_Sum_II_113;

import java.util.*;

public class Solution {
  public static List<List<Integer>> pathsum(TreeNode root, int targetsum) {
    List<List<Integer>> res = new ArrayList<>();
    if (root == null) return res; // 非空判断

    List<Integer> path = new LinkedList<>();
    preorderdfs(root, targetsum, res, path);
    return res;
  }

  public static void preorderdfs(TreeNode root, int targetsum, List<List<Integer>> res, List<Integer> path) {
    path.add(root.val);
    // 遇到了叶子节点
    if (root.left == null && root.right == null) {
      // 找到了和为 targetsum 的路径
      if (targetsum - root.val == 0) {
        res.add(new ArrayList<>(path));
      }
      return; // 如果和不为 targetsum，返回
    }

    if (root.left != null) {
      preorderdfs(root.left, targetsum - root.val, res, path);
      path.remove(path.size() - 1); // 回溯
    }
    if (root.right != null) {
      preorderdfs(root.right, targetsum - root.val, res, path);
      path.remove(path.size() - 1); // 回溯
    }
  }

  public static void main(String[] args) {
    /* Construct the following tree
                   1
                 /   \
                /     \
               2       3
              /      /   \
             /      /     \
            4      5       6
                  / \
                 /   \
                7     8
    */
//    Root, Left, Right
    TreeNode tree = new TreeNode(1);
    tree.left = new TreeNode(2);
    tree.right = new TreeNode(3);
    tree.left.left = new TreeNode(4);
    tree.right.left = new TreeNode(5);
    tree.right.right = new TreeNode(6);
    tree.right.left.left = new TreeNode(7);
    tree.right.left.right = new TreeNode(8);
    System.out.println(pathsum(tree, 16));
  }
}
