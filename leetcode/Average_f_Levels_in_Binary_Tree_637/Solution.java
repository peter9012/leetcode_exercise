package Average_f_Levels_in_Binary_Tree_637;

import java.util.*;

public class Solution {
  public static List < Double > averageOfLevels(TreeNode root) {
    List < Double > res = new ArrayList< >();
    Queue < TreeNode > queue = new LinkedList < > ();
    queue.add(root);
    while (!queue.isEmpty()) {
      long sum = 0, count = 0;
      Queue < TreeNode > temp = new LinkedList < > ();
      while (!queue.isEmpty()) {
        TreeNode n = queue.remove();
        sum += n.val;
        count++;
        if (n.left != null)
          temp.add(n.left);
        if (n.right != null)
          temp.add(n.right);
      }
      queue = temp;
      res.add(sum * 1.0 / count);
    }
    return res;
  }

  public static void main(String[] args) {
    /* Construct the following tree
                   3
                 /   \
                /     \
               9       20
              /  \
             /    \
            15     7

    */
//    Root, Left, Right
    TreeNode tree = new TreeNode(3);
    tree.left = new TreeNode(9);
    tree.right = new TreeNode(20);
    tree.left.left = new TreeNode(15);
    tree.right.left = new TreeNode(7);
    System.out.println(averageOfLevels(tree));
  }
}
