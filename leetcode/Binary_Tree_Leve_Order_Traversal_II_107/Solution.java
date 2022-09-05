package Binary_Tree_Leve_Order_Traversal_II_107;

import java.util.*;

public class Solution {
  static List<List<Integer>> levels = new ArrayList<List<Integer>>();

  public static void helper(TreeNode node, int level) {
    // start the current level
    if (levels.size() == level)
      levels.add(new ArrayList<Integer>());

    // append the current node value
    levels.get(level).add(node.val);

    // process child nodes for the next level
    if (node.left != null)
      helper(node.left, level + 1);
    if (node.right != null)
      helper(node.right, level + 1);
  }

  public static List<List<Integer>> levelOrderBottom(TreeNode root) {
    if (root == null) return levels;
    helper(root, 0);
    Collections.reverse(levels);
    return levels;
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
    TreeNode tree = new TreeNode(1);
    tree.left = new TreeNode(2);
    tree.right = new TreeNode(3);
    tree.left.left = new TreeNode(4);
    tree.right.left = new TreeNode(5);
    tree.right.right = new TreeNode(6);
    tree.right.left.left = new TreeNode(7);
    tree.right.left.right = new TreeNode(8);
    System.out.println(levelOrderBottom(tree));
  }
}
