package Find_Largest_Value_in_Each_Tree_Row_515;

import java.util.*;

public class Solution {
  public static List<Integer> largestValues(TreeNode root) {
    if(root == null){
      return Collections.emptyList();
    }
    List<Integer> result = new ArrayList();
    Queue<TreeNode> queue = new LinkedList();
    queue.offer(root);
    while(!queue.isEmpty()){
      int max = Integer.MIN_VALUE;
      for(int i = queue.size(); i > 0; i--){
        TreeNode node = queue.poll();
        max = Math.max(max, node.val);
        if(node.left != null) queue.offer(node.left);
        if(node.right != null) queue.offer(node.right);
      }
      result.add(max);
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
    TreeNode tree = new TreeNode(1);
    tree.left = new TreeNode(2);
    tree.right = new TreeNode(3);
    tree.left.left = new TreeNode(4);
    tree.right.left = new TreeNode(5);
    tree.right.right = new TreeNode(6);
    tree.right.left.left = new TreeNode(7);
    tree.right.left.right = new TreeNode(8);
    System.out.println(largestValues(tree));
  }
}
