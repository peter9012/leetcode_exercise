package Convert_Sorted_Array_to_Binary_Search_Tree_108;

class Solution {

  static final int COUNT = 10;

  public static TreeNode sortedArrayToBST(int[] nums) {
    TreeNode root = traversal(nums, 0, nums.length - 1);
    return root;
  }

  // 左闭右闭区间[left, right)
  private static TreeNode traversal(int[] nums, int left, int right) {
    if (left > right) return null;

    int mid = left + ((right - left) >> 1);
    TreeNode root = new TreeNode(nums[mid]);
    root.left = traversal(nums, left, mid - 1);
    root.right = traversal(nums, mid + 1, right);
    return root;
  }

  public static void preorder(TreeNode root) {
    if (root == null) {
      return;
    }
    System.out.print(root.val + " ");
    preorder(root.left);
    preorder(root.right);
  }

  static void print2DUtil(TreeNode root, int space) {
    if (root == null)
      return;
    space += COUNT;

    // Process right child first
    print2DUtil(root.right, space);

    // Print current node after space
    // count
    System.out.print("\n");
    for (int i = COUNT; i < space; i++)
      System.out.print(" ");
    System.out.print(root.val + "\n");

    // Process left child
    print2DUtil(root.left, space);
  }

  static void print2D(TreeNode root)
  {
    // Pass initial space count as 0
    print2DUtil(root, 0);
  }
  public static void main(String[] args) {
    TreeNode root;
    int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7};
    int n = arr.length;
    root = sortedArrayToBST(arr);
    System.out.println("Preorder traversal of constructed BST");
    preorder(root);
    print2D(root);
  }
}
