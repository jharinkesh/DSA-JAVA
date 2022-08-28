package tree;

public class TreeUtils extends TreeTraversal {

  public static int height(Node root) {
    if (root == null || ((root.left == null && root.right == null)))
      return 0;
    int l = height(root.left);
    int r = height(root.right);
    return ((l > r) ? l : r) + 1;
  }

  public static boolean isSymmetric(Node root) {
    return isMirror(root, root);
  }

  public static boolean isMirror(Node root1, Node root2) {
    boolean isMirror = root1 != null && root2 != null;
    if (!isMirror && root1 != null && root2 != null) {
      isMirror = (root1.data == root2.data) && isMirror(root1.left, root2.right)
          && isMirror(root1.right, root2.left);
    }
    return isMirror;
  }

  public static int max(Node root) {
    if (root == null)
      return -1;

    if (root.left == null && root.right == null)
      return root.data;

    int l = max(root.left);
    int r = max(root.right);
    int max = l > r ? l : r;
    return max > root.data ? max : root.data;
  }

  public static boolean found(Node root, int key) {
    boolean f = false;
    if (root != null) {
      f = root.data == key;
      if (!f) {
        f = found(root.left, key) || found(root.right, key);
      }
    }
    return f;
  }

  public static int count(Node root) {
    if (root == null)
      return 0;
    return count(root.left) + count(root.right) + 1;
  }

  public static String findRoute(Node root, int key) {
    if (root == null)
      return null;

    if (root.data == key)
      return key + "";

    String route = findRoute(root.left, key);
    if (route == null) {
      route = findRoute(root.right, key);
    }

    if (route != null) {
      route = route + " , " + root.data;
    }

    return route;
  }

}
