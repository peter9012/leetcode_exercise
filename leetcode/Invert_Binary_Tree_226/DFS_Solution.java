package Invert_Binary_Tree_226;

public class DFS_Solution {
  public TreeNode invertTree(TreeNode root) {
    if(root == null) return null;
    invertTree(root.left);
    invertTree(root.right);
    swapChildren(root);
    return root;
  }
  private void swapChildren(TreeNode root) {
    TreeNode tmp = root.left;
    root.left = root.right;
    root.right = tmp;
  }
}
