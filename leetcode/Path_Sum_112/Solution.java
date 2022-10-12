package Path_Sum_112;

public class Solution {
  public static boolean haspathsum(TreeNode root, int targetsum) {
    if (root == null) {
      return false;
    }
    targetsum -= root.val;
    // 叶子结点
    if (root.left == null && root.right == null) {
      return targetsum == 0;
    }
    if (root.left != null) {
      boolean left = haspathsum(root.left, targetsum);
      if (left) {// 已经找到
        return true;
      }
    }
    if (root.right != null) {
      boolean right = haspathsum(root.right, targetsum);
      if (right) {// 已经找到
        return true;
      }
    }
    return false;
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
    System.out.println(haspathsum(tree, 16));
  }
}
