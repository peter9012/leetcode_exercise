package Clone_Graph_133;


import java.util.*;

class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {}

    public Node(int _val,List<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
};

class Solution {
  private HashMap<Node, Node> visited = new HashMap <> ();
  public Node cloneGraph(Node node) {
    if (node == null) {
      return node;
    }

    // If the node was already visited before.
    // Return the clone from the visited dictionary.
    if (visited.containsKey(node)) {
      return visited.get(node);
    }

    // Create a clone for the given node.
    // Note that we don't have cloned neighbors as of now, hence [].
    Node cloneNode = new Node(node.val, new ArrayList());
    // The key is original node and value being the clone node.
    visited.put(node, cloneNode);

    // Iterate through the neighbors to generate their clones
    for (Node neighbor: node.neighbors) {
      cloneNode.neighbors.add(cloneGraph(neighbor));
    }
    return cloneNode;
  }
}
