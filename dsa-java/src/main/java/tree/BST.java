package tree;

public class BST {
  public static void main(String[] args) {
    // TNode root = new TNode(10);
    // TNode five = new TNode(5);
    // TNode twenty = new TNode(20);
    // root.left = five;
    // root.right = twenty;
    //
    // TNode four = new TNode(4);
    // TNode six = new TNode(6);
    // five.left = four;
    // five.right = six;
    //
    // TNode fifteen = new TNode(15);
    // TNode twoFive = new TNode(25);
    //
    // twenty.left = fifteen;
    // twenty.right = twoFive;
    //
    // twoFive.right = new TNode(40);
    // // System.out.println(search(root, 15));
    // // System.out.println(search(root, 75));
    // System.out.println(max(root));
    System.out.println("\ninserting 6");
    insertItr(6);
    inOrder(root);

    System.out.println("\ninserting 9");
    insertItr(9);
    inOrder(root);

    System.out.println("\ninserting 10");
    insertItr(10);
    inOrder(root);

    System.out.println("\ninserting 5");
    insertItr(5);
    inOrder(root);

    System.out.println("\ninserting 3");
    insertItr(3);
    inOrder(root);

  }

  static TNode root;

  static void insertItr(int key) {
    if (root == null)
      root = new TNode(key);
    else {
      TNode x = root, p = null;
      while (x != null) {
        p = x;
        if (key < x.key)
          x = x.left;
        else
          x = x.right;
      }

      if (key < p.key)
        p.left = new TNode(key);
      else
        p.right = new TNode(key);
    }

  }

  static void inOrder(TNode root) {
    if (root != null) {
      inOrder(root.left);
      System.out.print(root.key + " ");
      inOrder(root.right);
    }
  }

  static TNode insert(TNode root, int key) {
    if (root == null)
      return new TNode(key);
    if (key < root.key)
      root.left = insert(root.left, key);
    else
      root.right = insert(root.right, key);
    return root;
  }

  static int max(TNode root) {
    int max = root.key;
    while (root.right != null) {
      max = root.key;
      root = root.right;
    }
    max = root.key;
    return max;
  }

  static TNode search(TNode root, int k) {
    if (root == null)
      return null;
    if (k == root.key)
      return root;
    if (k < root.key)
      return search(root.left, k);
    else
      return search(root.right, k);
  }
}


class TNode {
  int key;
  TNode left, right;

  TNode(int key) {
    this.key = key;
  }

  @Override
  public String toString() {
    return "TNode [key=" + key + "]";
  }
}
