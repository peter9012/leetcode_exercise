package Validate_Binary_Search_Tree_98;

public class Solution {
 TreeNode max;
 public boolean isValidBST(TreeNode root) {
  if(root == null) return true;
  // left
  boolean left = isValidBST(root.left);
   if (!left) {
     return false;
   }
   // medium
   if (max != null && root.val <= max.val) {
     return false;
   }
   max = root;
   // right
   boolean right = isValidBST(root.right);
   return right;
 }
}
