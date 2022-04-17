package Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal_105;

import java.util.*;

public class Solution {
  static int preorderIndex;
  static Map<Integer, Integer> inorderIndexMap;
  public static TreeNode buildTree(int[] preorder, int[] inorder) {
    preorderIndex = 0;
    // build a hashmap to store value -> its index relations
    inorderIndexMap = new HashMap<>();
    for (int i = 0; i < inorder.length; i++) {
      inorderIndexMap.put(inorder[i], i);
    }

    return arrayToTree(preorder, 0, preorder.length - 1);
  }

  private static TreeNode arrayToTree(int[] preorder, int left, int right) {
    // if there are no elements to construct the tree
    if (left > right) return null;

    // select the preorder_index element as the root and increment it
    int rootValue = preorder[preorderIndex++];
    TreeNode root = new TreeNode(rootValue);

    // build left and right subtree
    // excluding inorderIndexMap[rootValue] element because it's the root
    root.left = arrayToTree(preorder, left, inorderIndexMap.get(rootValue) - 1);
    root.right = arrayToTree(preorder, inorderIndexMap.get(rootValue) + 1, right);
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

  public static void preorderTraversal(TreeNode root)
  {
    if (root == null) {
      return;
    }

    System.out.print(root.val + " ");
    preorderTraversal(root.left);
    preorderTraversal(root.right);
  }

  public static void main(String[] args) {
    int[] preorder = { 3, 9, 20, 15, 7 };
    int[] inorder = { 9, 3, 15, 20, 7};
    TreeNode root = buildTree(preorder, inorder);
    System.out.print("The inorder traversal is ");
    inorderTraversal(root);

    System.out.print("\nThe preorder traversal is ");
    preorderTraversal(root);
  }
}
