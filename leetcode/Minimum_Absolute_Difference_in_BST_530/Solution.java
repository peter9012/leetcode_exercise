package Minimum_Absolute_Difference_in_BST_530;

public class Solution {
  static TreeNode pre;// 记录上一个遍历的结点
  static int result = Integer.MAX_VALUE;
  public static int getMinimumDifference(TreeNode root) {
    if(root==null)return 0;
    traversal(root);
    return result;
  }
  public static void traversal(TreeNode root){
    if(root==null)return;
    //左
    traversal(root.left);
    //中
    if(pre!=null){
      result = Math.min(result,root.val-pre.val);
    }
    pre = root;
    //右
    traversal(root.right);
  }

  public static void main(String[] args) {
    TreeNode tree = new TreeNode(4);
    tree.left = new TreeNode(2);
    tree.right = new TreeNode(6);
    tree.left.left = new TreeNode(1);
    tree.left.right = new TreeNode(3);
    System.out.print("the minimum absolute difference between the values of any two different nodes in the tree is ");
    System.out.println(getMinimumDifference(tree));
  }
}
