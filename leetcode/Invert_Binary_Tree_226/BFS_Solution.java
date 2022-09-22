package Invert_Binary_Tree_226;

import java.util.*;

public class BFS_Solution {
  public TreeNode invertTree(TreeNode root) {
    if (root == null) {return null;}
    ArrayDeque<TreeNode> deque = new ArrayDeque<>();
    deque.offer(root);
    while (!deque.isEmpty()) {
      int size = deque.size();
      while (size-- > 0) {
        TreeNode node = deque.poll();
        swap(node);
        if (node.left != null) {deque.offer(node.left);}
        if (node.right != null) {deque.offer(node.right);}
      }
    }
    return root;
  }

  public void swap(TreeNode root) {
    TreeNode temp = root.left;
    root.left = root.right;
    root.right = temp;
  }
}
