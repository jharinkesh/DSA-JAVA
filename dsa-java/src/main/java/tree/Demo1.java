package tree;

public class Demo1 {
  public static void main(String[] args) {
    Node root = TreeMaker.makeMirrorTree();
    // TreeTraversal.preOrder(root);
    // TreeTraversal.postOrder(root);
    // TreeTraversal.inOrder(root);
    // TreeTraversal.levelOrder(root);
    // System.out.println(TreeUtils.height(root));
    // System.out.println(TreeUtils.max(root));
    // System.out.println(TreeUtils.found(root, 50));
    // System.out.println(TreeUtils.count(root));

    // System.out.println(TreeUtils.findRoute(root, 1));
    System.out.println(TreeUtils.isSymmetric(root));
  }
}
