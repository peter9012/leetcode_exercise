package Convert_BST_to_Greater_Tree_538;

public class Solution {
  static int sum;
  public static TreeNode convertBST(TreeNode root) {
    sum = 0;
    convertBST1(root);
    return root;
  }
  public static void convertBST1(TreeNode root) {
    if (root == null) {
      return;
    }
    convertBST1(root.right);
    sum += root.val;
    root.val = sum;
    convertBST1(root.left);
  }

  static final int COUNT = 10;
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
    print2D(convertBST(tree));
  }
}
