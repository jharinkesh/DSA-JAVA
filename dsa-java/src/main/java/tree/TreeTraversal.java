package tree;

import java.util.LinkedList;

public class TreeTraversal {

  public static void levelOrder(Node root) {
    LinkedList<Node> queue = new LinkedList<>();
    queue.add(root);
    while (!queue.isEmpty()) {
      Node current = queue.pop();
      System.out.print(current.data + " , ");
      if (current.left != null)
        queue.add(current.left);
      if (current.right != null)
        queue.add(current.right);
    }
  }

  public static void preOrder(Node root) {
    if (root != null) {
      System.out.print(root.data + " , ");
      preOrder(root.left);
      preOrder(root.right);
    }
  }

  public static void postOrder(Node root) {
    if (root != null) {
      postOrder(root.left);
      postOrder(root.right);
      System.out.print(root.data + " , ");
    }
  }

  public static void inOrder(Node root) {
    if (root != null) {
      inOrder(root.left);
      System.out.print(root.data + " , ");
      inOrder(root.right);
    }
  }
}
