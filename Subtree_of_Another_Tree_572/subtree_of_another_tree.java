package Subtree_of_Another_Tree_572;
import java.util.*;

public class subtree_of_another_tree {

  public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
      }
    }

  HashSet < String > trees = new HashSet < > ();
  
  public boolean isSubtree(TreeNode s, TreeNode t) {
    String tree1 = preorder(s,true);
    String tree2 = preorder(t,true);
    return tree1.indexOf(tree2) >= 0;
  }

  public String preorder(TreeNode t, boolean left) {
    if (t == null) {
      if (left)
        return "lnull";
      else
        return "rnull";
    }
    return "#"+t.val + " " +preorder(t.left, true)+" " +preorder(t.right, false);
  }
}