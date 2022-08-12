package Binary_Tree_Preorder_Traversal_144;

import java.util.*;

public class Solution {
  public static List<Integer> preorderTraversal(TreeNode root) {
    List<Integer> result = new ArrayList<Integer>();
    preorder(root, result);
    return result;
  }

  public static void preorder(TreeNode root, List<Integer> result) {
    if (root == null) {
      return;
    }
    result.add(root.val);
    preorder(root.left, result);
    preorder(root.right, result);
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
    System.out.println(preorderTraversal(tree));
  }
}
