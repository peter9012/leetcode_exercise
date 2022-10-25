package Trim_a_Binary_Search_Tree_669;

class Solution {
  static final int COUNT = 10;

  public static TreeNode trimBST(TreeNode root, int low, int high) {
    if (root == null) {
      return null;
    }
    if (root.val < low) {
      return trimBST(root.right, low, high);
    }
    if (root.val > high) {
      return trimBST(root.left, low, high);
    }
    // root在[low,high]范围内
    root.left = trimBST(root.left, low, high);
    root.right = trimBST(root.right, low, high);
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

  static void print2DUtil(TreeNode root, int space) {
    if (root == null)
      return;
    space += COUNT;

    // Process right child first
    print2DUtil(root.right, space);

    // Print current node after space
    // count
    System.out.print("\n");
    for (int i = COUNT; i < space; i++)
      System.out.print(" ");
    System.out.print(root.val + "\n");

    // Process left child
    print2DUtil(root.left, space);
  }

  static void print2D(TreeNode root)
  {
    // Pass initial space count as 0
    print2DUtil(root, 0);
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
//    inorder(trimBST(tree,4,7));
    print2D(trimBST(tree,4,7));
  }
}

