package Binary_Tree_Right_Side_View_199;

import java.util.*;


public class Solution {
  static List<Integer> rightside = new ArrayList();

  public static void helper(TreeNode node, int level) {
    if (level == rightside.size())
      rightside.add(node.val);

    if (node.right != null)
      helper(node.right, level + 1);
    if (node.left != null)
      helper(node.left, level + 1);
  }

  public static List<Integer> rightSideView(TreeNode root) {
    if (root == null) return rightside;

    helper(root, 0);
    return rightside;
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
    System.out.println(rightSideView(tree));
  }
}
