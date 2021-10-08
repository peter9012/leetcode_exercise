package Tree;

import java.util.ArrayList;
import java.util.List;

//class TreeNode {
//  int val;
//  TreeNode left;
//  TreeNode right;
//  TreeNode() {}
//  TreeNode(int val) { this.val = val; }
//  TreeNode(int val, TreeNode left, TreeNode right) {
//    this.val = val;
//    this.left = left;
//    this.right = right;
//  }
//}
public class Binary_Tree_Level_Order_Traversal_102 {

  static List<List<Integer>> levels = new ArrayList<List<Integer>>();

  public static void helper(TreeNode node, int level) {
    // start the current level
    if (levels.size() == level)
      levels.add(new ArrayList<Integer>());

    // fulfil the current level
    levels.get(level).add(node.val);

    // process child nodes for the next level
    if (node.left != null)
      helper(node.left, level + 1);
    if (node.right != null)
      helper(node.right, level + 1);
  }

  public static List<List<Integer>> levelOrder(TreeNode root) {
    if (root == null) return levels;
    helper(root, 0);
    return levels;
  }

  public static void main(String[] args)
  {
    TreeNode root_2 = new TreeNode(1);
    root_2.left = new TreeNode(2);
    root_2.right = new TreeNode(3);
    root_2.left.left = new TreeNode(4);
    root_2.right.left = new TreeNode(5);
    root_2.right.right = new TreeNode(6);
    root_2.right.left.left = new TreeNode(7);
    root_2.right.left.right = new TreeNode(8);
    System.out.println(levelOrder(root_2));
  }
}
