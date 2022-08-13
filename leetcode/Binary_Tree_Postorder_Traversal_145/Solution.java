package Binary_Tree_Postorder_Traversal_145;

import java.util.*;

public class Solution {
  public static List<Integer> postorderTraversal(TreeNode root) {
    List<Integer> res = new ArrayList<>();
    postorder(root, res);
    return res;
  }

  static void postorder(TreeNode root, List<Integer> list) {
    if (root == null) {
      return;
    }
    postorder(root.left, list);
    postorder(root.right, list);
    list.add(root.val);             // 注意这一句
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
    System.out.println(postorderTraversal(tree));
  }
}
