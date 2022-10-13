package Construct_Binary_Tree_from_Inorder_and_Postorder_Traversal_106;

import java.util.*;

public class Solution {
  static Map<Integer, Integer> map;  // 方便根据数值查找位置
  public static TreeNode buildTree(int[] inorder, int[] postorder) {
    map = new HashMap<>();
    for (int i = 0; i < inorder.length; i++) { // 用map保存中序序列的数值对应位置
      map.put(inorder[i], i);
    }

    return findNode(inorder,  0, inorder.length, postorder,0, postorder.length);  // 前闭后开
  }

  public static TreeNode findNode(int[] inorder, int inBegin, int inEnd, int[] postorder, int postBegin, int postEnd) {
    // 参数里的范围都是前闭后开
    if (inBegin >= inEnd || postBegin >= postEnd) {  // 不满足左闭右开，说明没有元素，返回空树
      return null;
    }
    int rootIndex = map.get(postorder[postEnd - 1]);  // 找到后序遍历的最后一个元素在中序遍历中的位置
    TreeNode root = new TreeNode(inorder[rootIndex]);  // 构造结点
    int lenOfLeft = rootIndex - inBegin;  // 保存中序左子树个数，用来确定后序数列的个数
    root.left = findNode(inorder, inBegin, rootIndex,
            postorder, postBegin, postBegin + lenOfLeft);
    root.right = findNode(inorder, rootIndex + 1, inEnd,
            postorder, postBegin + lenOfLeft, postEnd - 1);

    return root;
  }

    public static void inorderTraversal(TreeNode root)
  {
    if (root == null) {
      return;
    }

    inorderTraversal(root.left);
    System.out.print(root.val + " ");
    inorderTraversal(root.right);
  }

  public static void main(String[] args) {
    int[] preorder = { 9,15,7,20,3 };
    int[] inorder = { 9,3,15,20,7};
    TreeNode root = buildTree(inorder,preorder);
    inorderTraversal(root);
  }
}
