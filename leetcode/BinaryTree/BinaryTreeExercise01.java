package BinaryTree;

class Node
{
  int key;
  Node left, right;
 
  public Node(int item)
  {
    key = item;
    left = right = null;
  }
}

public class BinaryTreeExercise01 {
  Node root;
  BinaryTreeExercise01 (int key)
  {
    root = new Node(key);
  }
  BinaryTreeExercise01() {
    root = null;
  }
  public static void main(String[] args) {
    BinaryTreeExercise01 tree = new BinaryTreeExercise01();
    tree.root = new Node(1);
    tree.root.left = new Node(2);
    tree.root.right = new Node(3);
    tree.root.left.left = new Node(4);
  }
}