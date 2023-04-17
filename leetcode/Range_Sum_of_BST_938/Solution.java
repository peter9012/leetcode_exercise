package Range_Sum_of_BST_938;

public class Solution {
  static int ans;
  public static int rangeSumBST(TreeNode root, int low, int high) {
    ans = 0;
    dfs(root, low, high);
    return ans;
  }

  public static void dfs(TreeNode node, int low, int high) {
    if (node != null) {
      if (low <= node.val && node.val <= high)
        ans += node.val;
      if (low < node.val)
        dfs(node.left, low, high);
      if (node.val < high)
        dfs(node.right, low, high);
    }
  }

  public static void main(String[] args) {

    /* Construct the following tree
                  10
                 /   \
                /     \
               5       15
              / \       \
             /   \       \
            3     7       18
    */
    TreeNode tree = new TreeNode(10);
    tree.left = new TreeNode(5);
    tree.right = new TreeNode(15);
    tree.left.left = new TreeNode(3);
    tree.left.right = new TreeNode(7);
    tree.right.right = new TreeNode(18);
    System.out.println(rangeSumBST(tree, 7, 15));
  }
}