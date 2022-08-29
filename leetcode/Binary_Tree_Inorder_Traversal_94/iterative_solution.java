package Binary_Tree_Inorder_Traversal_94;

import java.util.*;

public class iterative_solution {
  public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> result = new LinkedList<>();
    Stack<TreeNode> st = new Stack<>();
    if (root != null) st.push(root);
    while (!st.empty()) {
      TreeNode node = st.peek();
      if (node != null) {
        st.pop(); // 将该节点弹出，避免重复操作，下面再将右中左节点添加到栈中
        if (node.right!=null) st.push(node.right);  // 添加右节点（空节点不入栈）
        st.push(node);                          // 添加中节点
        st.push(null); // 中节点访问过，但是还没有处理，加入空节点做为标记。

        if (node.left!=null) st.push(node.left);    // 添加左节点（空节点不入栈）
      } else { // 只有遇到空节点的时候，才将下一个节点放进结果集
        st.pop();           // 将空节点弹出
        node = st.peek();    // 重新取出栈中元素
        st.pop();
        result.add(node.val); // 加入到结果集
      }
    }
    return result;
  }
}
