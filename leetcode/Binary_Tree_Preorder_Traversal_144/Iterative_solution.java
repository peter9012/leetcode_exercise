package Binary_Tree_Preorder_Traversal_144;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Iterative_solution {
  public static List<Integer> preorderTraversal(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    if (root == null){
      return result;
    }
    Stack<TreeNode> stack = new Stack<>();
    stack.push(root);
    while (!stack.isEmpty()){
      TreeNode node = stack.pop();
      result.add(node.val);
      if (node.right != null){
        stack.push(node.right);
      }
      if (node.left != null){
        stack.push(node.left);
      }
    }
    return result;
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
    System.out.println(preorderTraversal(tree));
  }
}
