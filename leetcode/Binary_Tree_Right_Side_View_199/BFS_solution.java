package Binary_Tree_Right_Side_View_199;

import java.util.*;

public class BFS_solution {
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
    System.out.println(rightSideView(tree));
  }
}
