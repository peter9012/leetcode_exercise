package Find_Bottom_Left_Tree_Value_513;


class Solution {
  private static int Deep = -1;
  private static int value = 0;
  public static int findBottomLeftValue(TreeNode root) {
    value = root.val;
    findLeftValue(root,0);
    return value;
  }


  private static void findLeftValue(TreeNode root, int deep) {
    if (root == null) return;
    if (root.left == null && root.right == null) {
      if (deep > Deep) {
        value = root.val;
        Deep = deep;
      }
    }
    if (root.left != null) findLeftValue(root.left,deep + 1);
    if (root.right != null) findLeftValue(root.right,deep + 1);
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
    System.out.println(findBottomLeftValue(tree));
  }
}
