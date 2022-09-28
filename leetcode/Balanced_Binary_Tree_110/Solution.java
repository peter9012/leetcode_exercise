package Balanced_Binary_Tree_110;

class Solution {

  public static boolean isBalanced(TreeNode root) {
    return getHeight(root) != -1;
  }

  private static int getHeight(TreeNode root) {
    if (root == null) {
      return 0;
    }
    int leftHeight = getHeight(root.left);
    if (leftHeight == -1) {
      return -1;
    }
    int rightHeight = getHeight(root.right);
    if (rightHeight == -1) {
      return -1;
    }
    // 左右子树高度差大于1，return -1表示已经不是平衡树了
    if (Math.abs(leftHeight - rightHeight) > 1) {
      return -1;
    }
    return Math.max(leftHeight, rightHeight) + 1;
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
    System.out.println(isBalanced(tree));
  }
}
