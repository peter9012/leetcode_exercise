package Tree;

import java.util.*;

public class Binary_Tree_Right_Side_View_199 {
  public static List<Integer> rightSideView(TreeNode root) {
    if (root == null) return new ArrayList<Integer>();

    ArrayDeque<TreeNode> nextLevel = new ArrayDeque() {{ offer(root); }};
    ArrayDeque<TreeNode> currLevel = new ArrayDeque();
    List<Integer> rightside = new ArrayList();

    TreeNode node = null;
    while (!nextLevel.isEmpty()) {
      // prepare for the next level
      currLevel = nextLevel.clone();
      nextLevel.clear();

      while (! currLevel.isEmpty()) {
        node = currLevel.poll();

        // add child nodes of the current level
        // in the queue for the next level
        if (node.left != null)
          nextLevel.offer(node.left);
        if (node.right != null)
          nextLevel.offer(node.right);
      }

      // The current level is finished.
      // Its last element is the rightmost one.
      if (currLevel.isEmpty())
        rightside.add(node.val);
    }
    return rightside;
  }

  public static void main(String[] args)
  {
    TreeNode root3 = new TreeNode(1);
    root3.left = new TreeNode(2);
    root3.right = new TreeNode(3);
    root3.right.right = new TreeNode(4);
    root3.left.right = new TreeNode(5);
    System.out.println(rightSideView(root3));
  }
}
