package tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

  public static void main(String[] args) {
    TreeNode root = new TreeNode(1);
    TreeNode two = new TreeNode(2);
    TreeNode three = new TreeNode(3);
    root.left = two;
    root.right = three;

    TreeNode four = new TreeNode(4);
    TreeNode five = new TreeNode(5);
    two.left = four;
    two.right = five;

    TreeNode six = new TreeNode(6);
    TreeNode seven = new TreeNode(7);
    three.left = six;
    three.right = seven;

    seven.right = new TreeNode(8);

    // inorder(root);
    // preOrder(root);
    // levelOrder(root);
    // System.out.println(height(root));
    System.out.println(search(root, 6));
    System.out.println(search(root, 61));
    System.out.println(search(root, 8));


  }


  static boolean search(TreeNode root, int sk) {
    if (root == null)
      return false;
    return root.key == sk || search(root.left, sk) || search(root.right, sk);
  }


  static int height(TreeNode root) {
    if (root == null || (root.left == null & root.right == null)) {
      return 0;
    }

    int l = height(root.left);
    int r = height(root.right);
    return max(l, r) + 1;
  }

  static int max(int a, int b) {
    return Integer.max(a, b);
  }

  static void levelOrder(TreeNode root) {
    Queue<TreeNode> q = new LinkedList<TreeNode>();
    q.add(root);
    while (!q.isEmpty()) {
      TreeNode p = q.poll();
      System.out.print(p.key + " ");
      if (p.left != null)
        q.add(p.left);
      if (p.right != null)
        q.add(p.right);
    }
  }

  static void preOrder(TreeNode root) {
    if (root != null) {
      System.out.println(root.key);
      preOrder(root.left);
      preOrder(root.right);
    }
  }

  static void inorder(TreeNode root) {
    if (root != null) {
      inorder(root.left);
      System.out.print(root.key + " ");
      inorder(root.right);
    }
  }

}
