package Insert_into_Binary_Search_Tree_701;

class Solution {
  public static TreeNode insertIntoBST(TreeNode root, int val) {
    if (root == null) // 如果当前节点为空，也就意味着val找到了合适的位置，此时创建节点直接返回。
      return new TreeNode(val);

    if (root.val < val){
      root.right = insertIntoBST(root.right, val); // 递归创建右子树
    }else if (root.val > val){
      root.left = insertIntoBST(root.left, val); // 递归创建左子树
    }
    return root;
  }

  public static TreeNode constructBST(int[] keys)
  {
    TreeNode root = null;
    for (int key: keys) {
      root = insertIntoBST(root, key);
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

  public static void main(String[] args)
  {
    int[] keys = { 15, 10, 20, 8, 12, 16, 25 };

    TreeNode root = constructBST(keys);
    inorder(root);
  }
}
