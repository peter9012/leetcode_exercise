package Inorder_Successor_in_BST_285;

class Solution {

  private TreeNode previous;
  private TreeNode inorderSuccessorNode;

  public TreeNode inorderSuccessor(TreeNode root, TreeNode p)  {
    if (p.right != null) {
      TreeNode leftmost = p.right;

      while (leftmost.left != null) {
        leftmost = leftmost.left;
      }
      this.inorderSuccessorNode = leftmost;
    }
    else {
      this.inorderCase2(root, p);
    }
    return this.inorderSuccessorNode;
  }

  private void inorderCase2(TreeNode node, TreeNode p) {
    if (node == null) {
      return;
    }
    // Recurse on the left side
    this.inorderCase2(node.left, p);

    // Check if previous is the inorder predecessor of node
    if (this.previous == p && this.inorderSuccessorNode == null) {
      this.inorderSuccessorNode = node;
      return;
    }

    // Keeping previous up-to-date for further recursions
    this.previous = node;

    // Recurse on the right side
    this.inorderCase2(node.right, p);
  }
}
