package Find_Mode_in_Binary_Search_Tree_501;

import java.util.*;

public class Solution {
  static ArrayList<Integer> resList;
  static int maxCount;
  static int count;
  static TreeNode pre;

  public static int[] findMode(TreeNode root) {
    resList = new ArrayList<>();
    maxCount = 0;
    count = 0;
    pre = null;
    findMode1(root);
    int[] res = new int[resList.size()];
    for (int i = 0; i < resList.size(); i++) {
      res[i] = resList.get(i);
    }
    return res;
  }

  public static void findMode1(TreeNode root) {
    if (root == null) {
      return;
    }
    findMode1(root.left);

    int rootValue = root.val;
    // 计数
    if (pre == null || rootValue != pre.val) {
      count = 1;
    } else {
      count++;
    }
    // 更新结果以及maxCount
    if (count > maxCount) {
      resList.clear();
      resList.add(rootValue);
      maxCount = count;
    } else if (count == maxCount) {
      resList.add(rootValue);
    }
    pre = root;

    findMode1(root.right);
  }

  public static void main(String[] args) {
    TreeNode tree = new TreeNode(1);
    tree.right = new TreeNode(2);
    tree.right.left = new TreeNode(2);
    System.out.println(Arrays.toString(findMode(tree)));
  }
}
