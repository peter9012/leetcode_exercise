package Binary_Tree_Inorder_Traversal_94;

import java.util.*;

public class Solution {
  public static List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> res = new ArrayList<>();
    inorder(root, res);
    return res;
  }

  static void inorder(TreeNode root, List<Integer> list) {
    if (root == null) {
      return;
    }
    inorder(root.left, list);
    list.add(root.val);             // 注意这一句
    inorder(root.right, list);
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
    System.out.println(inorderTraversal(tree));
  }

}
