package Binary_Tree_Paths_257;

import java.util.*;

public class Solution {
  /**
   * 递归法
   */
  public static List<String> binaryTreePaths(TreeNode root) {
    List<String> res = new ArrayList<>();
    if (root == null) {
      return res;
    }
    List<Integer> paths = new ArrayList<>();
    traversal(root, paths, res);
    return res;
  }

  private static void traversal(TreeNode root, List<Integer> paths, List<String> res) {
    paths.add(root.val);
    // 叶子结点
    if (root.left == null && root.right == null) {
      // 输出
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < paths.size() - 1; i++) {
        sb.append(paths.get(i)).append("->");
      }
      sb.append(paths.get(paths.size() - 1));
      res.add(sb.toString());
      return;
    }
    if (root.left != null) {
      traversal(root.left, paths, res);
      paths.remove(paths.size() - 1);// 回溯
    }
    if (root.right != null) {
      traversal(root.right, paths, res);
      paths.remove(paths.size() - 1);// 回溯
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
    System.out.println(binaryTreePaths(tree));
  }
}
