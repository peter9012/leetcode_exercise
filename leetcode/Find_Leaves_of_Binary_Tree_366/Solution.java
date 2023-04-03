package Find_Leaves_of_Binary_Tree_366;

import java.util.*;

public class Solution {
  public static List<List<Integer>> findLeaves(TreeNode root) {
    List<List<Integer>> list = new ArrayList<>();
    findLeavesHelper(list, root);
    return list;
  }

  // return the level of root
  private static int findLeavesHelper(List<List<Integer>> list, TreeNode root) {
    if (root == null) {
      return -1;
    }
    int leftLevel = findLeavesHelper(list, root.left);
    int rightLevel = findLeavesHelper(list, root.right);
    int level = Math.max(leftLevel, rightLevel) + 1;
    if (list.size() == level) {
      list.add(new ArrayList<>());
    }
    list.get(level).add(root.val);
    root.left = root.right = null;
    return level;
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
    System.out.println(findLeaves(tree));
  }
}
