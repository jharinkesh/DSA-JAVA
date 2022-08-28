package tree;

public class Node {
  int data;
  Node left;
  Node right;

  public Node(int data) {
    this.data = data;
  }

  public Node(Node left, int data, Node right) {
    this.left = left;
    this.data = data;
    this.right = right;
  }

  @Override
  public String toString() {
    return "Node [data=" + data + "]";
  }

}
