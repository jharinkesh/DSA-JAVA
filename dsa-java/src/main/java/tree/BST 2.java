package tree;

public class BST {

  public static void main(String[] args) {
    Node root = TreeMaker.makeBST();
    insert(root, 8);
    // TreeTraversal.levelOrder(root);
    // System.out.println(search(root, 8));
    // System.out.println(min(root));
    //System.out.println(getParent(root, 8));
  }

  static Node getParent(Node root, int key) {
    Node x = root;
    if (x.data == key)
      return null;

    while (x != null) {

      if (x.left != null && x.left.data == key) {
        return x;
      }

      if (x.right != null && x.right.data == key) {
        return x;
      }

      if (key < x.data) {
        x = x.left;
      } else {
        x = x.right;
      }
    }

    return x;
  }

  static Node max(Node root) {
    if (root.right == null)
      return root;
    return max(root.right);
  }

  static Node min(Node root) {
    if (root.left == null)
      return root;
    return max(root.left);
  }

  static Node search(Node root, int key) {
    if (root == null || root.data == key)
      return root;
    if (key < root.data)
      return search(root.left, key);
    else
      return search(root.right, key);
  }

  static void insert(Node root, int key) {
    if (key < root.data) {
      if (root.left == null) {
        root.left = new Node(key);
      } else {
        insert(root.left, key);
      }
    } else {
      if (root.right == null) {
        root.right = new Node(key);
      } else {
        insert(root.right, key);
      }
    }
  }

}
