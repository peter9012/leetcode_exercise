package Binary_Tree_Leve_Order_Traversal_II_107;

import java.util.*;

public class Solution {
  List<List<Integer>> levels = new ArrayList<List<Integer>>();

  public void helper(TreeNode node, int level) {
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

  public List<List<Integer>> levelOrderBottom(TreeNode root) {
    if (root == null) return levels;
    helper(root, 0);
    Collections.reverse(levels);
    return levels;
  }
}
