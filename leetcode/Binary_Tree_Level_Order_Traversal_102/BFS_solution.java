package Binary_Tree_Level_Order_Traversal_102;

import java.util.*;

public class BFS_solution {

  public static List<List<Integer>> resList = new ArrayList<List<Integer>>();

  public static List<List<Integer>> levelOrder(TreeNode root) {
    helper(root);

    return resList;
  }
  public static void helper(TreeNode node) {
    if (node == null) return;
    Queue<TreeNode> que = new LinkedList<TreeNode>();
    que.offer(node);

    while (!que.isEmpty()) {
      List<Integer> itemList = new ArrayList<Integer>();
      int len = que.size();

      while (len > 0) {
        TreeNode tmpNode = que.poll();
        itemList.add(tmpNode.val);

        if (tmpNode.left != null) que.offer(tmpNode.left);
        if (tmpNode.right != null) que.offer(tmpNode.right);
        len--;
      }
      resList.add(itemList);
    }
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
    System.out.println(levelOrder(tree));
  }
}
