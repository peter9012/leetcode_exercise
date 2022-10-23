package Lowest_Common_Ancestor_of_Binary_Search_Tree_235;

public class Solution {
  public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    if (root.val > p.val && root.val > q.val) return lowestCommonAncestor(root.left, p, q);
    if (root.val < p.val && root.val < q.val) return lowestCommonAncestor(root.right, p, q);
    return root;
  }

  public static void main(String[] args) {
    /* Construct the following tree
                   1
                 /   \
                /     \
               2       10
              /      /   \
             /      /     \
            0      6       12
                  / \
                 /   \
                5     7
    */
//    Root, Left, Right
    TreeNode tree = new TreeNode(1);
    tree.left = new TreeNode(2);
    tree.right = new TreeNode(10);
    tree.left.left = new TreeNode(0);
    tree.right.left = new TreeNode(6);
    tree.right.right = new TreeNode(12);
    tree.right.left.left = new TreeNode(5);
    tree.right.left.right = new TreeNode(7);
    TreeNode t = lowestCommonAncestor(tree,tree.right.left.left,tree.right.right);
    System.out.println(t.val);
  }
}
