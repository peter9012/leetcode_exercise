package Validate_Binary_Search_Tree_98;

public class Solution {
  static TreeNode max;
  public static boolean isValidBST(TreeNode root) {
    if(root == null) return true;
    // left
    boolean left = isValidBST(root.left);
    if (!left) {
      return false;
    }
    // medium
    if (max != null && root.val <= max.val) {
      return false;
    }
    max = root;
    // right
    boolean right = isValidBST(root.right);
    return right;
  }

  public static void main(String[] args) {
    TreeNode tree = new TreeNode(3);
    tree.left = new TreeNode(2);
    tree.right = new TreeNode(5);

    if (isValidBST(tree))
      System.out.println("Is BST");
    else
      System.out.println("Not a BST");

  }
}
