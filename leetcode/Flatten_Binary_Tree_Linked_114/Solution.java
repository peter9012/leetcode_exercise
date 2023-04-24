package Flatten_Binary_Tree_Linked_114;

public class Solution {

  public static void flatten(TreeNode root) {
    if (root == null) return;

    TreeNode left = root.left;
    TreeNode right = root.right;

    root.left = null;

    flatten(left);
    flatten(right);

    root.right = left;
    TreeNode cur = root;
    while (cur.right != null) cur = cur.right;
    cur.right = right;
  }

  public static void inOrder(TreeNode node)
  {
    // Base Condition
    if (node == null)
      return;
    inOrder(node.left);
    System.out.print(node.val + " ");
    inOrder(node.right);
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
    System.out.println(
            "The Inorder traversal after flattening binary tree ");
    flatten(tree);
    inOrder(tree);

  }
}
