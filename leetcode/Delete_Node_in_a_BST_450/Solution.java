package Delete_Node_in_a_BST_450;

public class Solution {
  public static TreeNode deleteNode(TreeNode root, int key) {
    root = delete(root,key);
    return root;
  }
  private static TreeNode delete(TreeNode root, int key) {
    if (root == null) return null;
    if (root.val > key) {
      root.left = delete(root.left,key);
    } else if (root.val < key) {
      root.right = delete(root.right,key);
    } else {
      if (root.left == null) return root.right;
      if (root.right == null) return root.left;
      TreeNode tmp = root.right; // 找右子树最左面的节点
      while (tmp.left != null) {
        tmp = tmp.left;
      }
      root.val = tmp.val;
      root.right = delete(root.right,tmp.val);
    }
    return root;
  }

  public static void inorder(TreeNode root)
  {
    if (root == null) {
      return;
    }

    inorder(root.left);
    System.out.print(root.val + " ");
    inorder(root.right);
  }

  public static void main(String[] args) {
        /* Construct the following tree
                   5
                 /   \
                /     \
               3       6
              / \       \
             /   \       \
            2     4       7
    */
    TreeNode tree = new TreeNode(5);
    tree.left = new TreeNode(3);
    tree.right = new TreeNode(6);
    tree.left.left = new TreeNode(2);
    tree.left.right = new TreeNode(4);
    tree.right.right = new TreeNode(7);
    inorder(deleteNode(tree,3));
  }
}
