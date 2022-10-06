package Sum_of_Left_Leaves_404;

public class Solution {

  public static int sumOfLeftLeaves(TreeNode root) {
    if (root == null) return 0;
    int leftValue = sumOfLeftLeaves(root.left);    // 左
    int rightValue = sumOfLeftLeaves(root.right);  // 右

    int midValue = 0;
    if (root.left != null && root.left.left == null && root.left.right == null) {
      midValue = root.left.val;
    }
    int sum = midValue + leftValue + rightValue;  // 中
    return sum;
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
    System.out.println(sumOfLeftLeaves(tree));
  }
}
