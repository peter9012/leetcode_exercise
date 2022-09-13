package Average_f_Levels_in_Binary_Tree_637;

import java.util.*;

public class DFS_Solution {
  public static List < Double > averageOfLevels(TreeNode root) {
    List < Integer > count = new ArrayList< >();
    List < Double > res = new ArrayList < > ();
    average(root, 0, res, count);
    for (int i = 0; i < res.size(); i++)
      res.set(i, res.get(i) / count.get(i));
    return res;
  }
  public static void average(TreeNode t, int i, List<Double> sum, List<Integer> count) {
    if (t == null)
      return;
    if (i < sum.size()) {
      sum.set(i, sum.get(i) + t.val);
      count.set(i, count.get(i) + 1);
    } else {
      sum.add(1.0 * t.val);
      count.add(1);
    }
    average(t.left, i + 1, sum, count);
    average(t.right, i + 1, sum, count);
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
